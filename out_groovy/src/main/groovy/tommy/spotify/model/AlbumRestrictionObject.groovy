package tommy.spotify.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@Canonical
class AlbumRestrictionObject {

    enum ReasonEnum {
    
        MARKET("market"),
        
        PRODUCT("product"),
        
        EXPLICIT("explicit")
    
        private final String value
    
        ReasonEnum(String value) {
            this.value = value
        }
    
        String getValue() {
            value
        }
    
        @Override
        String toString() {
            String.valueOf(value)
        }
    }

    /* The reason for the restriction. Albums may be restricted if the content is not available in a given market, to the user's subscription type, or when the user's account is set to not play explicit content. Additional reasons may be added in the future.  */
    ReasonEnum reason
}
