package jwt.security.user;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class ChangePasswordReq {

    private String currentPassword;
    private String newPassword;
    private String confirmationPassword;
}
