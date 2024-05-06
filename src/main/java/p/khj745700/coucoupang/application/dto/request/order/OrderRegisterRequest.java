package p.khj745700.coucoupang.application.dto.request.order;

import lombok.*;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Builder
public class OrderRegisterRequest {
    Long productId;
    Integer quantity;
}
