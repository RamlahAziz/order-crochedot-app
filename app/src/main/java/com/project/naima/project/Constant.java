package com.project.naima.project;

/**
 * Created by C_v on 10/29/2017.
 */


import java.util.ArrayList;

/**
 * 常量
 * Created by ios on 15/6/25.
 */
public interface Constant {

    //change it to false for uploading to production
    boolean SWITCH_ENVIRONMENT_TESTING = false;

    boolean SUPPORT_BUGLY = true;
    boolean SUPPORT_GOOGLE_ANALYSIS = true;
    boolean SUPPORT_MULTI_QUALFITY = false;

    String SHORT_URL_APP = "https://goo.gl/lbpJfn";
    String APP_LINK = "https://fb.me/706955986165945";
    String PREVIEW_IMAGE = "https://s3-us-west-2.amazonaws.com/thankyo/image/invite.jpg";
    String Terms_URL = "http://www.streamkar.com/agreement";

    ArrayList<String> numberArray = new ArrayList<>();
    /**
     * After switching the application for 3 minutes, close the room long link
     */
    long ROOM_WS_KEEP_TIME = 3 * 60 * 1000L;

    int PORTALTYPE_DEMO = 202;
    int PORTALTYPE_WEB = 201;
    int DEFAULT_PORTALTYPE = 201;
    int KENYA_PORTALTYPE = 221;
    // Id's for corresponding categories
    int LABEL_ID_GAMING = 206;
    int LABEL_ID_ENTERTAINMENT = 208;
    int LABEL_ID_LEARNING = 209;
    int LABEL_ID_NEWTALENT = 207;

    //****** SharedPreferences key *******
    String SP_NAME_USER = "sp_name_user";
    String SP_NAME_ADVERTISE = "sp_name_user";
    String SP_KEY_USERINFO = "sp_key_userinfo";
    String SP_KEY_CARTINFO = "sp_key_cartinfo";
    String SP_KEY_USERINFO_REMEMBER = "sp_key_userinfo_remember";
    String SP_KEY_ENVIRONMENT = "sp_key_environment";
    String SP_KEY_ADVERTISEINFO = "sp_key_userinfo";
    String SP_KEY_ACCOUNTS = "sp_key_accounts";
    String SP_KEY_ACCOUNT_LATEST = "sp_key_account_latest";


    String SP_ENVIRONMENT = "sp_environment";
    String SP_NAME_STATUS = "sp_name_status";
    String SECRET_KEY = "secret_key_for_password";
    String SP_REMEMBER = "sp_remember";
    String SP_REMEMBER_ME = "sp_remember_me";
    String SP_KEY_OPEN_APP_VERSION = "sp_key_open_app_version-";
    String SP_KEY_OPEN_APP = "sp_key_open_app";
    String SP_KEY_TIP_GO_LIVE = "sp_key_tip_go_live";

    String SP_KEY_CITYNAME = "sp_key_cityname";
    String SP_KEY_PORTALTYPE = "sp_key_portaltype";
    String SP_KEY_VIP_FIRST = "sp_vip_first";
    String SP_KEY_TIP_SEND_GIFT = "sp_key_tip_send_gift";
    String SP_KEY_TIP_FOLLOW = "sp_key_tip_follow";
    String SP_KEY_TIP_LIVE = "sp_key_tip_live";
    String SP_KEY_TIP_STREAMING = "sp_key_tip_streaming";

    String InApp_PERCHASE_KEY = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAy6RG0a8ffiZ96ZZgIXqp34iJ4NyDjY5bGUNMDyP63Rss1vqVt8wl2nZDymlh96y9xgmswZPg4YI++Ra0WQYLvll7n+VGslKiC7I/HJ9si3rfYWjtYViYqQFgd+MQ/ob327HTVRqwZt09VWenUf7V32Ee2DuOXfYqfZAlPOJr4X6gebBNjyBPtcUCRwCh2fwxnSqtfkBelhg/0vfkxW9lXGkkL9yI/qxfNHIYfYPXVqAaRS0y4KYVPOB20hArIiPVp4Tv33dgnZv2GAEay/siUEZP6GCPEVCZlstgkB/wcAKNyCNnk0nzbMih1oyO9YOxOHfVFaMBqA4pfSvdBnLcZQIDAQAB";

    String FIRST_LAUNCH_INVITE = "first_launch_invite";
    String SP_NAME_CONFIG = "sp_name_config";

    String SP_KEY_LOCATION = "sp_key_location";
    String SP_KEY_LOCATION_ID = "sp_key_location_id";

    String SP_KEY_CONFIGINFO = "sp_key_configinfo";
    String SP_KEY_DISCOUNT_VIP = "sp_key_discount_vip";
    String SP_KEY_DISCOUNT_CAR = "sp_key_discount_car";
    String SP_NAME_SETTING = "sp_name_setting";
    String SP_CONFIG_LOADED = "sp_config_loaded";
    String SP_NAME_ADS = "sp_name_ads";
    String SP_KEY_LIVE_SETTING = "sp_key_live_setting";
    String LIVE_SHARPNESS = "live_sharpness";
    String LIVE_ORIENTATION = "live_orientation";
    String SP_KEY_SETTING_FOLLOW_NOTIFICATION = "sp_key_setting_follow_notification";
    String SP_KEY_ADS_TIME = "sp_key_ads_time";
    String SP_KEY_SETTING_TOP_NOTIFICATION = "sp_key_setting_top_notification";
    String SP_KEY_SETTING_System_NOTIFICATION = "sp_key_setting_system_notification";
    String SP_KEY_IS_INSIDE_CHAT = "sp_key_is_inside_chat";
    String INTENT_EXTRA_DMN = "intent_extra_dm_notification";
    String SP_KEY_IS_INSIDE_Streaming = "sp_key_is_inside_streaming";


    String SP_NAME_COOKIE = "sp_name_cookie";
    String SP_KEY_COOKIE_APP = "sp_key_cookie_app";
    String SP_KEY_COOKIE_JSESSIONID = "sp_key_cookie_jsessionid";

    //////////shared pref cash out keys
    String SP_cashOut_Info = "cashout_info";
    String SP_cashOut_Info_EP = "cashout_info_ep";
    String SP_cashOut_Info_BA = "cashout_info_ba";

    final String ANIMAION_PREFRENCES = "animaton_prefrences";
    final String ANIMATIONINFO = "animationinfo";

    //****** intent extra key  ******
    String INTENT_EXTRA_SPLASH_ADVERTISE = "intent_extra_splash_advertise";
    String INTENT_EXTRA_VIP = "intent_extra_vip"; // 进入VIP页面
    String INTENT_EXTRA_USERID = "intent_extra_userid";
    String INTENT_EXTRA_USERINFO = "intent_extra_userinfo";
    String INTENT_EXTRA_ITEMINFO = "intent_extra_iteminfo";

    String INTENT_EXTRA_VIDEOINFO = "intent_extra_videoinfo";
    String INTENT_EXTRA_COINS = "intent_extra_coins";

    String INTENT_EXTRA_TRENDING = "intent_extra_trending";
    String INTENT_EXTRA_TOPGIFTERS = "intent_extra_top";
    String INTENT_EXTRA_TALENT_ID = "intent_extra_talent_id";
    String INTENT_EXTRA_TALENT_INFO = "intent_extra_talent_info";
    String INTENT_EXTRA_FOLDER_NAME = "intent_extra_folder_name";
    String INTENT_EXTRA_LOCAL_IMAGE = "intent_extra_local_image";
    String INTENT_EXTRA_IMAGE_URIS = "intent_extra_image_uris";
    String INTENT_EXTRA_CROP = "intent_extra_crop";
    String INTENT_EXTRA_CROP_AVATAR = "intent_extra_crop_avatar";
    String INTENT_EXTRA_CROP_POSTER = "intent_extra_crop_poster";
    String INTENT_EXTRA_AGENCY_ID = "intent_extra_agencyinfo";
    String INTENT_EXTRA_LABEL_ID = "intent_extra_label_id";
    String INTENT_EXTRA_CONFIG_LOADED = "intent_extra_config_loaded";
    String INTENT_EXTRA_BROADCAST_SUMMARY = "intent_extra_broadcast_summary";
    String INTENT_EXTRA_SMS_CONTENT = "intent_extra_sms_content";
    String INTENT_EXTRA_TYPE_NOTIFICATTION = "intent_extra_type_notification";
    String INTENT_EXTRA_CHANGE_ENVIRONMENT = "intent_extra_environment";
    String OPENTALENT_COVER_IMAGE_PATH = "opentalent_cover_image_path";
    String OPENTALENT_NAME = "opentalent_name";


    String LEADERBOARD_CATEGORY = "leaderBoard_category";
    String LEADERBOARD_CATEGORY_DURATION = "leaderBoard_category_duration";
    String LEADERBOARD_CATEGORY_TRENDING = "trending";
    String LEADERBOARD_CATEGORY_TOPGIFTERS = "topGifters";
    String LEADERBOARD_CATEGORY_COINS = "coins";
    //Invite Friends Ranking
    String INVITE_RANKING_COINS = "invite_ranking_coins";
    String INVITE_RANKING_INVITES = "invite_ranking_invites";

    //****** bundle key  ******
    String BUNDLE_TALENT_ID = "bundle_talent_id";

    //****** request code *******
    int REQUEST_CODE_PHOTO = 1; // 修改头像/新增相册
    int REQUEST_CODE_ALBUM = 2; // 请求本地相册
    int REQUEST_CODE_CAMERA = 3; // 请求相机
    int REQUEST_CODE_EDIT_USER = 4; // 修改个人信息
    int REQUEST_CODE_CROP = 5; // 裁剪
    int REQUEST_CODE_MODIFY_EMAIL = 6; // 修改邮箱
    int REQUEST_CODE_MODIFY_AREA = 7; // 修改地区
    int REQUEST_CODE_MODIFY_GENDER = 8; // 修改性别
    int REQUEST_CODE_MODIFY_NICKNAME = 9; // 修改昵称
    int REQUEST_CODE_SIGNIN = 10; // login
    int REQUEST_CODE_SIGNUP = 11; // registered
    int REQUEST_CODE_FORGOTPASSWORD = 12; //FORGOTPASSWORD
    int REQUEST_CODE_PAYMENT_PAYPAL = 20;
    int REQUEST_CODE_PAYMENT_EASY_PAISA = 21;
    int REQUEST_CODE_PAYMENT_MPESA = 35;
    int REQUEST_CODE_PERMISSIONS_CAMERA = 22;
    int REQUEST_CODE_ROOM_POSTER = 23; // edit room poster
    int REQUEST_CODE_TWEET_COMPOSER = 24;
    int REQUEST_CODE_SCREEN_RECORD = 30;
    int REQUEST_CODE_SCREEN_SHOT = 31;
    int REQUEST_CODE_MODIFY_DOB = 32;
    int REQUEST_CODE_MODIFY_COMMENT = 33; // 修改昵称
    int REQUEST_CODE_MODIFY_LOCATION = 34;     //    social media
    Integer SNS_TYPE_FACEBOOK = 1;
    Integer SNS_TYPE_TWITTER = 2;
    Integer SNS_TYPE_GOOGLEPLUS = 3;
    Integer SNS_TYPE_INSTAGRAM = 4;
    int REQUEST_CODE_CHANGE_LOCATION = 33;
    int REQUEST_CODE_CHANGE_COUNTRY_LOCATION = 40;
    int REQUEST_CODE_GALLERY_CHANGE = 25;


    int SHARE_SNS_TYPE_INSTAGRAM = 1;
    int SHARE_SNS_TYPE_WHATSAPP = 2;
    int SHARE_SNS_TYPE_SKYPE = 3;
    int SHARE_SNS_TYPE_MESSENGER = 4;
    int SHARE_SNS_TYPE_SNAPCHAT = 5;
    int SHARE_SNS_TYPE_FACEBOOK = 6;
    int SHARE_SNS_TYPE_TWIITER = 7;

    //animation types
    int FRAME_AUDIO = 1;
    int SCALE_TRANSFORM_FRAME = 2;
    int SCALE_TRANSFORM = 3;
    int FALL_ANIMATION = 4;
    int RISE_ANIMATION = 5;
    int FULL_SCREEN_FRAME_ANIMATION = 6;
    ///email pattern
    String emailPattern = "[a-zA-Z0-9._-]+@[a-z]+\\.+[a-z]+";
    String PREFIX_PN = "+92";

    //  --------  BroadcastReceiver Action   ---------
    String ACTION_SMS = "com.streamkar.action.sms";


    // sms center number
    String KENYA_CODE = "KE";
    String PAKISTAN_CODE = "PK";
    String SMS_ORIGINATING_ADDRESS = "99096";


    String KENYA_NAME = "Kenya";
    String PAKISTAN_NAME = "Pakistan";
    String VIDEO_STREAM = "VideoStream";
    int CAR = 29189;
    String GARAGE_USER = "user";
    int REQUEST_BUY_ACTIVUTY = 569;
    String ANIM_CONFIG_FILE = "animationConfigs.json";
    String SERVER_CONFIG_FILE = "serverConfigs.json";

    class QueryType {
        public static int QUERY_RESULT = 2;
        public static int QUERY_TOTAL = 1;
        public static int QUERY_ALL_RESULTS = -1;
    }
}