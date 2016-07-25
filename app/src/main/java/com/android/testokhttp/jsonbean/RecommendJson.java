package com.android.testokhttp.jsonbean;

import java.util.List;

/**
 * Created by Administrator on 2016/7/24.
 */
public class RecommendJson {
    /**
     * state : 1
     * code : 10000
     * return_info : 错误信息
     * body : [{"rDate":"日期","scene":{"id":21,"name":"海贼宿舍","label":"海贼王","groupID":22,"sceneGroup":{"id":22,"name":"动漫风"},"collectionNum":333,"collected":0,"forwordNum":12,"commentNum":6,"imgUrl":"asd"},"topic":{"id":21,"name":"好枕头","groupID":22,"topicGroup":{"id":22,"name":"枕头"},"collectionNum":333,"collected":0,"forwordNum":12,"commentNum":6,"imgUrl":"asd"},"strategy":{"id":22,"name":"名称","collectionNum":333,"collected":0,"forwordNum":12,"commentNum":6,"imgUrl":"asd"}}]
     */

    private int state;
    private String code;
    private String return_info;
    /**
     * rDate : 日期
     * scene : {"id":21,"name":"海贼宿舍","label":"海贼王","groupID":22,"sceneGroup":{"id":22,"name":"动漫风"},"collectionNum":333,"collected":0,"forwordNum":12,"commentNum":6,"imgUrl":"asd"}
     * topic : {"id":21,"name":"好枕头","groupID":22,"topicGroup":{"id":22,"name":"枕头"},"collectionNum":333,"collected":0,"forwordNum":12,"commentNum":6,"imgUrl":"asd"}
     * strategy : {"id":22,"name":"名称","collectionNum":333,"collected":0,"forwordNum":12,"commentNum":6,"imgUrl":"asd"}
     */

    private List<BodyBean> body;

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getReturn_info() {
        return return_info;
    }

    public void setReturn_info(String return_info) {
        this.return_info = return_info;
    }

    public List<BodyBean> getBody() {
        return body;
    }

    public void setBody(List<BodyBean> body) {
        this.body = body;
    }

    public static class BodyBean {
        private String rDate;
        /**
         * id : 21
         * name : 海贼宿舍
         * label : 海贼王
         * groupID : 22
         * sceneGroup : {"id":22,"name":"动漫风"}
         * collectionNum : 333
         * collected : 0
         * forwordNum : 12
         * commentNum : 6
         * imgUrl : asd
         */

        private SceneBean scene;
        /**
         * id : 21
         * name : 好枕头
         * groupID : 22
         * topicGroup : {"id":22,"name":"枕头"}
         * collectionNum : 333
         * collected : 0
         * forwordNum : 12
         * commentNum : 6
         * imgUrl : asd
         */

        private TopicBean topic;
        /**
         * id : 22
         * name : 名称
         * collectionNum : 333
         * collected : 0
         * forwordNum : 12
         * commentNum : 6
         * imgUrl : asd
         */

        private StrategyBean strategy;

        public String getRDate() {
            return rDate;
        }

        public void setRDate(String rDate) {
            this.rDate = rDate;
        }

        public SceneBean getScene() {
            return scene;
        }

        public void setScene(SceneBean scene) {
            this.scene = scene;
        }

        public TopicBean getTopic() {
            return topic;
        }

        public void setTopic(TopicBean topic) {
            this.topic = topic;
        }

        public StrategyBean getStrategy() {
            return strategy;
        }

        public void setStrategy(StrategyBean strategy) {
            this.strategy = strategy;
        }

        public static class SceneBean {
            private int id;
            private String name;
            private String label;
            private int groupID;
            /**
             * id : 22
             * name : 动漫风
             */

            private SceneGroupBean sceneGroup;
            private int collectionNum;
            private int collected;
            private int forwordNum;
            private int commentNum;
            private String imgUrl;

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getLabel() {
                return label;
            }

            public void setLabel(String label) {
                this.label = label;
            }

            public int getGroupID() {
                return groupID;
            }

            public void setGroupID(int groupID) {
                this.groupID = groupID;
            }

            public SceneGroupBean getSceneGroup() {
                return sceneGroup;
            }

            public void setSceneGroup(SceneGroupBean sceneGroup) {
                this.sceneGroup = sceneGroup;
            }

            public int getCollectionNum() {
                return collectionNum;
            }

            public void setCollectionNum(int collectionNum) {
                this.collectionNum = collectionNum;
            }

            public int getCollected() {
                return collected;
            }

            public void setCollected(int collected) {
                this.collected = collected;
            }

            public int getForwordNum() {
                return forwordNum;
            }

            public void setForwordNum(int forwordNum) {
                this.forwordNum = forwordNum;
            }

            public int getCommentNum() {
                return commentNum;
            }

            public void setCommentNum(int commentNum) {
                this.commentNum = commentNum;
            }

            public String getImgUrl() {
                return imgUrl;
            }

            public void setImgUrl(String imgUrl) {
                this.imgUrl = imgUrl;
            }

            public static class SceneGroupBean {
                private int id;
                private String name;

                public int getId() {
                    return id;
                }

                public void setId(int id) {
                    this.id = id;
                }

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }
            }
        }

        public static class TopicBean {
            private int id;
            private String name;
            private int groupID;
            /**
             * id : 22
             * name : 枕头
             */

            private TopicGroupBean topicGroup;
            private int collectionNum;
            private int collected;
            private int forwordNum;
            private int commentNum;
            private String imgUrl;

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public int getGroupID() {
                return groupID;
            }

            public void setGroupID(int groupID) {
                this.groupID = groupID;
            }

            public TopicGroupBean getTopicGroup() {
                return topicGroup;
            }

            public void setTopicGroup(TopicGroupBean topicGroup) {
                this.topicGroup = topicGroup;
            }

            public int getCollectionNum() {
                return collectionNum;
            }

            public void setCollectionNum(int collectionNum) {
                this.collectionNum = collectionNum;
            }

            public int getCollected() {
                return collected;
            }

            public void setCollected(int collected) {
                this.collected = collected;
            }

            public int getForwordNum() {
                return forwordNum;
            }

            public void setForwordNum(int forwordNum) {
                this.forwordNum = forwordNum;
            }

            public int getCommentNum() {
                return commentNum;
            }

            public void setCommentNum(int commentNum) {
                this.commentNum = commentNum;
            }

            public String getImgUrl() {
                return imgUrl;
            }

            public void setImgUrl(String imgUrl) {
                this.imgUrl = imgUrl;
            }

            public static class TopicGroupBean {
                private int id;
                private String name;

                public int getId() {
                    return id;
                }

                public void setId(int id) {
                    this.id = id;
                }

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }
            }
        }

        public static class StrategyBean {
            private int id;
            private String name;
            private int collectionNum;
            private int collected;
            private int forwordNum;
            private int commentNum;
            private String imgUrl;

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public int getCollectionNum() {
                return collectionNum;
            }

            public void setCollectionNum(int collectionNum) {
                this.collectionNum = collectionNum;
            }

            public int getCollected() {
                return collected;
            }

            public void setCollected(int collected) {
                this.collected = collected;
            }

            public int getForwordNum() {
                return forwordNum;
            }

            public void setForwordNum(int forwordNum) {
                this.forwordNum = forwordNum;
            }

            public int getCommentNum() {
                return commentNum;
            }

            public void setCommentNum(int commentNum) {
                this.commentNum = commentNum;
            }

            public String getImgUrl() {
                return imgUrl;
            }

            public void setImgUrl(String imgUrl) {
                this.imgUrl = imgUrl;
            }
        }
    }
}
