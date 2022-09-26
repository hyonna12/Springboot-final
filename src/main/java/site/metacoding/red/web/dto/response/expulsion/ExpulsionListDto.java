package site.metacoding.red.web.dto.response.expulsion;

import java.sql.Timestamp;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class ExpulsionListDto {
	private Integer id;
	private String teamName;
	private String position;
	private String playerName;
	private String reason;
	private Timestamp deleteDate;
	
}
