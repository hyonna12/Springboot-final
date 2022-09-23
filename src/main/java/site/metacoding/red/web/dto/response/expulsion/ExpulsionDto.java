package site.metacoding.red.web.dto.response.expulsion;

import java.sql.Timestamp;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class ExpulsionDto {
	
	private Integer no;
	private String teamName;
	private String position;
	private String playerName;
	private String reason;
	private Timestamp deleteDate;
	
}
