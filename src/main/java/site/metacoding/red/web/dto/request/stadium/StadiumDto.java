package site.metacoding.red.web.dto.request.stadium;

import java.sql.Timestamp;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class StadiumDto {
	private Integer no;
	private String name;
	private Timestamp createDate;
}
