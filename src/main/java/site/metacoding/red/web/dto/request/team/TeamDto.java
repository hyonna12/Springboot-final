package site.metacoding.red.web.dto.request.team;

import java.sql.Timestamp;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
public class TeamDto {
	private Integer no;
	private Integer stadiumId;
	private String name;
	private String region;
	private Timestamp createDate;
}
