package com.android.testokhttp.jsonbean;

import java.util.List;

/**
 * Created by Administrator on 2016/7/24.
 */
public class UserMessageJson {
    /**
     * state : 1
     * body : [{"id":3,"cDate":"2008-08-09 23:22:24","commentID":34,"comment":{"id":3,"cDate":"2008-08-09 23:22:24","userID":123,"userInfo":{"nickname":"菜刀","headImgUrl":"http://23.jpg"},"replyed_id":22,"replyedInfo":{"nickname":"小刀","headImgUrl":"http://23.jpg"},"type":2,"pid":12,"pidImgUrl":"http://loushi.com/jsadj.png","content":"剁死你"}},{"id":3,"cDate":"2008-08-0923: 22: 24","commentID":34,"comment":{"id":31,"cDate":"2008-08-0923: 22: 24","userID":0,"userInfo":{"nickname":"陋室小秘书","headImgUrl":"http: //23.jpg"},"replyed_id":22,"replyedInfo":{"nickname":"小刀","headImgUrl":"http: //23.jpg"},"type":4,"pid":0,"pidImgUrl":"http: //loushi.com/jsadj.png","content":"感谢您的建议"}}]
     */

    private int state;
    /**
     * id : 3
     * cDate : 2008-08-09 23:22:24
     * commentID : 34
     * comment : {"id":3,"cDate":"2008-08-09 23:22:24","userID":123,"userInfo":{"nickname":"菜刀","headImgUrl":"http://23.jpg"},"replyed_id":22,"replyedInfo":{"nickname":"小刀","headImgUrl":"http://23.jpg"},"type":2,"pid":12,"pidImgUrl":"http://loushi.com/jsadj.png","content":"剁死你"}
     */

    private List<BodyBean> body;

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public List<BodyBean> getBody() {
        return body;
    }

    public void setBody(List<BodyBean> body) {
        this.body = body;
    }

    public static class BodyBean {
        private int id;
        private String cDate;
        private int commentID;
        /**
         * id : 3
         * cDate : 2008-08-09 23:22:24
         * userID : 123
         * userInfo : {"nickname":"菜刀","headImgUrl":"http://23.jpg"}
         * replyed_id : 22
         * replyedInfo : {"nickname":"小刀","headImgUrl":"http://23.jpg"}
         * type : 2
         * pid : 12
         * pidImgUrl : http://loushi.com/jsadj.png
         * content : 剁死你
         */

        private CommentBean comment;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getCDate() {
            return cDate;
        }

        public void setCDate(String cDate) {
            this.cDate = cDate;
        }

        public int getCommentID() {
            return commentID;
        }

        public void setCommentID(int commentID) {
            this.commentID = commentID;
        }

        public CommentBean getComment() {
            return comment;
        }

        public void setComment(CommentBean comment) {
            this.comment = comment;
        }

        public static class CommentBean {
            private int id;
            private String cDate;
            private int userID;
            /**
             * nickname : 菜刀
             * headImgUrl : http://23.jpg
             */

            private UserInfoBean userInfo;
            private int replyed_id;
            /**
             * nickname : 小刀
             * headImgUrl : http://23.jpg
             */

            private ReplyedInfoBean replyedInfo;
            private int type;
            private int pid;
            private String pidImgUrl;
            private String content;

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getCDate() {
                return cDate;
            }

            public void setCDate(String cDate) {
                this.cDate = cDate;
            }

            public int getUserID() {
                return userID;
            }

            public void setUserID(int userID) {
                this.userID = userID;
            }

            public UserInfoBean getUserInfo() {
                return userInfo;
            }

            public void setUserInfo(UserInfoBean userInfo) {
                this.userInfo = userInfo;
            }

            public int getReplyed_id() {
                return replyed_id;
            }

            public void setReplyed_id(int replyed_id) {
                this.replyed_id = replyed_id;
            }

            public ReplyedInfoBean getReplyedInfo() {
                return replyedInfo;
            }

            public void setReplyedInfo(ReplyedInfoBean replyedInfo) {
                this.replyedInfo = replyedInfo;
            }

            public int getType() {
                return type;
            }

            public void setType(int type) {
                this.type = type;
            }

            public int getPid() {
                return pid;
            }

            public void setPid(int pid) {
                this.pid = pid;
            }

            public String getPidImgUrl() {
                return pidImgUrl;
            }

            public void setPidImgUrl(String pidImgUrl) {
                this.pidImgUrl = pidImgUrl;
            }

            public String getContent() {
                return content;
            }

            public void setContent(String content) {
                this.content = content;
            }

            public static class UserInfoBean {
                private String nickname;
                private String headImgUrl;

                public String getNickname() {
                    return nickname;
                }

                public void setNickname(String nickname) {
                    this.nickname = nickname;
                }

                public String getHeadImgUrl() {
                    return headImgUrl;
                }

                public void setHeadImgUrl(String headImgUrl) {
                    this.headImgUrl = headImgUrl;
                }
            }

            public static class ReplyedInfoBean {
                private String nickname;
                private String headImgUrl;

                public String getNickname() {
                    return nickname;
                }

                public void setNickname(String nickname) {
                    this.nickname = nickname;
                }

                public String getHeadImgUrl() {
                    return headImgUrl;
                }

                public void setHeadImgUrl(String headImgUrl) {
                    this.headImgUrl = headImgUrl;
                }
            }
        }
    }
}
