package biz.globalvillage.airmap.utils.resp;


import biz.globalvillage.airmap.bean.res.Result;
import biz.globalvillage.airmap.enums.resp.RespStatusEnum;

public class ResponseUtil {

	/**
	 * 默认成功提示
	 */
	public static Result setDefaultSuccessResponse() {
		return new Result(RespStatusEnum.OK.getCode(), RespStatusEnum.OK.getMsg());
	}

	/**
	 * 默认错误提示
	 */
	public static Result setDefaultErrResponse() {
		return new Result(RespStatusEnum.SYS_ERROR.getCode(), RespStatusEnum.SYS_ERROR.getMsg());
	}

	/**
	 * 带错误消息的返回请求
	 */
	public static Result setErrResponse(String msg) {
		Result result = new Result(RespStatusEnum.NORMAL_ERROR.getCode(), msg);
		return result;
	}

	/**
	 * 带返回数据的成功请求
	 * @param data
	 */
	public static <T> Result<T> setSuccessDataResponse(T data) {
		return new Result(RespStatusEnum.OK.getCode(),RespStatusEnum.OK.getMsg(), data);
	}

	public static Result setErrResponse(int code, String msg) {
		return new Result(code, msg);
	}
}
