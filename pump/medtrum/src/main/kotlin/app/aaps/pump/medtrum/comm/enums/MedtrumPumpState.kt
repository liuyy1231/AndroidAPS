package app.aaps.pump.medtrum.comm.enums

enum class MedtrumPumpState(val state: Byte) {
    NONE(0),
    IDLE(1),
    FILLED(2),
    PRIMING(3),
    PRIMED(4),
    EJECTING(5),
    EJECTED(6),
    ACTIVE(32),
    ACTIVE_ALT(33),
    LOW_BG_SUSPENDED(64),
    LOW_BG_SUSPENDED2(65),
    AUTO_SUSPENDED(66),
    HOURLY_MAX_SUSPENDED(67),
    DAILY_MAX_SUSPENDED(68),
    SUSPENDED(69),
    PAUSED(70),
    OCCLUSION(96),
    EXPIRED(97),
    RESERVOIR_EMPTY(98),
    PATCH_FAULT(99),
    PATCH_FAULT2(100),
    BASE_FAULT(101),
    BATTERY_OUT(102),
    NO_CALIBRATION(103),
    STOPPED(128.toByte());

    fun isSuspendedByPump(): Boolean {
        return this in LOW_BG_SUSPENDED..SUSPENDED
    }

    companion object {

        fun fromByte(state: Byte) = MedtrumPumpState.entries.find { it.state == state }
            ?: throw IllegalAccessException("")
    }
}
