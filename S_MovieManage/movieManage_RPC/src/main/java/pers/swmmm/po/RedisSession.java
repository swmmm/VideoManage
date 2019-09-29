package pers.swmmm.po;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class RedisSession implements Serializable {

    private String sessionId=UUID.randomUUID().toString();
    private Map<String ,Object> map = new HashMap<String ,Object>();

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }

    public Map<String, Object> getMap() {
        return map;
    }

    public void setMap(Map<String, Object> map) {
        this.map = map;
    }

    public String getSessionId() {
        return sessionId;
    }

    public Object getAttribute(String name){
        return map.get(name);
    }
    public void setAttribute(String name,Object value){
        map.put(name,value);
    }
}
