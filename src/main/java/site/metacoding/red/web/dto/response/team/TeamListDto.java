package site.metacoding.red.web.dto.response.team;

import java.sql.Timestamp;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class TeamListDto {
	private Integer id;
	private String stadiumName;
	private String teamName;
	private String region;
	private Timestamp createDate;
	
}
