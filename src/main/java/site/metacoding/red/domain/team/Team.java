package site.metacoding.red.domain.team;

import java.sql.Timestamp;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class Team {
	private Integer id;
	private Integer stadiumId;
	private String teamName;
	private String region;
	private Timestamp createDate;
}
