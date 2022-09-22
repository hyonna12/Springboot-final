package site.metacoding.red.web.dto.request.expulsion;

import java.sql.Timestamp;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class ExpulsionDto {
	private Integer no;
	private String reason;
	private Integer playerId;
	private Timestamp createDate;
}
