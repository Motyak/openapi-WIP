package tommy.spotify.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;

@Canonical
class DeviceObject {
    /* The device ID. */
    String id
    /* If this device is the currently active device. */
    Boolean isActive
    /* If this device is currently in a private session. */
    Boolean isPrivateSession
    /* Whether controlling this device is restricted. At present if this is \"true\" then no Web API commands will be accepted by this device. */
    Boolean isRestricted
    /* A human-readable name for the device. Some devices have a name that the user can configure (e.g. \\\"Loudest speaker\\\") and some devices have a generic name associated with the manufacturer or device model. */
    String name
    /* Device type, such as \"computer\", \"smartphone\" or \"speaker\". */
    String type
    /* The current volume in percent. */
    Integer volumePercent
    /* If this device can be used to set the volume. */
    Boolean supportsVolume
}
