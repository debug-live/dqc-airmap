/**  
 * @Title: Result.java
 * @Package com.globalvillage.bg.baseUtils
 * @Description: TODO
 * @author likeke
 * @date 2016年5月17日
 */
package biz.globalvillage.airmap.bean.res;

/**
 * ClassName: Result 
 * @Description: TODO
 * @author likeke
 * @date 2016年5月17日
 * @version 1.0
 */
public class Result<T> {

	private Integer code; //编码
	private String msg;  //结果说明
	private T data;//数据

	public Result() {
	}

	public Result(int code, String msg) {
		this(code,msg,null);
	}

	public Result(int code, String msg, T data) {
		this.code = code;
		this.msg = msg;
		this.data = data;
	}

	public Integer getCode() {
		return code;
	}
	public void setCode(Integer code) {
		this.code = code;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}
}
