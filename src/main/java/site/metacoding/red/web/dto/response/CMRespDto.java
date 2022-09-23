package site.metacoding.red.web.dto.response;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class CMRespDto<T> {
	private Integer code;
	private String msg;
	private T data;
}
