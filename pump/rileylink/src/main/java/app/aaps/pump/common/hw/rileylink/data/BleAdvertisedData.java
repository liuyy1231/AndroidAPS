package app.aaps.pump.common.hw.rileylink.data;

import androidx.annotation.NonNull;

import java.util.List;
import java.util.UUID;

/**
 * Created by andy on 9/10/18.
 */

public class BleAdvertisedData {

    private final List<UUID> mUuids;
    private final String mName;


    public BleAdvertisedData(List<UUID> uuids, String name) {
        mUuids = uuids;
        mName = name;
    }


    public List<UUID> getUuids() {
        return mUuids;
    }


    public String getName() {
        return mName;
    }


    @NonNull public String toString() {
        return "BleAdvertisedData [name=" + mName + ", UUIDs=" + mUuids + "]";
    }
}
