package site.metacoding.red.web.dto.request.player;

import java.sql.Timestamp;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class PlayerDto {
	private Integer no;
	private String name;
	private Integer number;
	private Integer teamId;
	private String position;
	private Timestamp createDate;	
}
