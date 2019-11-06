package club.jadeshu.base.sxt.thread;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import org.apache.commons.io.FileUtils;

/**
 * @ClassName: StartThread02 
 * @version V1.0
 * @author: jadeshu
 * @date: 2018-12-21 上午4:51:38 
 * @Description:
 *  下载网络图片
 */
public class WebDown02 {
	/**
	* @Title: downLoader 
	* @param urlSrc 网络原地址
	* @param dst 写人的文件
	* @author jadeshu
	* @date 2018-12-21上午4:59:04
	 */
	public void downLoader(String urlSrc, String dst) {
		try {
			FileUtils.copyURLToFile(new URL(urlSrc), new File(dst));
		} catch (MalformedURLException e) {
			e.printStackTrace();
			System.out.println("不合法的路径");
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("图片下载失败");
		}
	}
}
