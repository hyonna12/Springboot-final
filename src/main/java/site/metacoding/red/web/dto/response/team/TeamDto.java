package site.metacoding.red.web.dto.response.team;

import java.sql.Timestamp;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class TeamDto {
	private Integer no;
	private String teamName;
	private String stadiumName;
	private String region;
}
