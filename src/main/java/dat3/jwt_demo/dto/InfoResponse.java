package dat3.jwt_demo.dto;

import lombok.Getter;

@Getter
public
class InfoResponse {
    String info;
    public InfoResponse(String info) {
        this.info = info;
    }
}

