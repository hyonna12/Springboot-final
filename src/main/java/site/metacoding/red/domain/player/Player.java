package site.metacoding.red.domain.player;

import java.sql.Timestamp;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class Player {
	private Integer id;
	private String playerName;
	private Integer number;
	private Integer teamId;
	private String position;
	private Timestamp createDate;	
}
