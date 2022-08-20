package tim.tsai.structural.proxy.proxy;

import tim.tsai.structural.proxy.libary.ThirdPartyYouTubeClass;
import tim.tsai.structural.proxy.libary.ThirdPartyYouTubeLib;
import tim.tsai.structural.proxy.libary.Video;

import java.util.HashMap;

/** 快取代理
 * @author timtsai
 * @date 2022/8/20
 */
public class YouTubeCacheProxy implements ThirdPartyYouTubeLib {
    /**
     * 引用原本的 Service
     */
    private ThirdPartyYouTubeLib youtubeService;
    private HashMap<String, Video> cachePopular = new HashMap<String, Video>();
    private HashMap<String, Video> cacheAll = new HashMap<String, Video>();

    public YouTubeCacheProxy() {
        this.youtubeService = new ThirdPartyYouTubeClass();
    }

    /**
     * 如果 cache 為空，則從 DB 要資料
     * @return
     */
    @Override
    public HashMap<String, Video> popularVideos() {
        if (cachePopular.isEmpty()) {
            cachePopular = youtubeService.popularVideos();
        } else {
            System.out.println("Retrieved list from cache.");
        }
        return cachePopular;
    }

    @Override
    public Video getVideo(String videoId) {
        Video video = cacheAll.get(videoId);
        if (video == null) {
            video = youtubeService.getVideo(videoId);
            cacheAll.put(videoId, video);
        } else {
            System.out.println("Retrieved video '" + videoId + "' from cache.");
        }
        return video;
    }

    public void reset() {
        cachePopular.clear();
        cacheAll.clear();
    }
}
