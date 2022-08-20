package tim.tsai.structural.proxy.libary;

import java.util.HashMap;

/** 遠端服務介面
 * @author timtsai
 * @date 2022/8/20
 */
public interface ThirdPartyYouTubeLib {
    HashMap<String, Video> popularVideos();

    Video getVideo(String videoId);
}
