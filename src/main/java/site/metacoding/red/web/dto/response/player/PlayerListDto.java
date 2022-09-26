package site.metacoding.red.web.dto.response.player;

import java.sql.Timestamp;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class PlayerListDto {
	private Integer id;
	private String playerName;
	private Integer number;
	private String teamName;
	private String position;
	private Timestamp createDate;
}
