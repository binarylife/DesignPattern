package com.feng.designpattern.责任链模式;

/**
 * Created by fengbei
 * on 20-11-17
 */
public class Request {

    private String name;
    private String reason;
    private int day;
    private String groupLeaderInfo;
    private String managerInfo;
    private String departmentHeaderInfo;
    private String coustomInfo;


    public Request(Builder builder) {

        this.name = builder.name;
        this.reason = builder.reason;
        this.day = builder.day;
        this.groupLeaderInfo = builder.groupLeaderInfo;
        this.managerInfo = builder.managerInfo;
        this.departmentHeaderInfo = builder.departmentHeaderInfo;
        this.coustomInfo = builder.coustomInfo;
    }

    public static class Builder {
        private String name;
        private String reason;
        private int day;
        private String groupLeaderInfo;
        private String managerInfo;
        private String departmentHeaderInfo;
        private String coustomInfo;

        public Builder() {

        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setReason(String reason) {
            this.reason = reason;
            return this;
        }

        public Builder setDay(int day) {
            this.day = day;
            return this;
        }

        public Builder setGroupLeaderInfo(String groupLeaderInfo) {
            this.groupLeaderInfo = groupLeaderInfo;
            return this;
        }

        public Builder setManagerInfo(String managerInfo) {
            this.managerInfo = managerInfo;
            return this;
        }

        public Builder setDepartmentHeaderInfo(String departmentHeaderInfo) {
            this.departmentHeaderInfo = departmentHeaderInfo;
            return this;
        }

        public Builder setCoustomInfo(String coustomInfo) {
            this.coustomInfo = coustomInfo;
            return this;
        }


        public Request build() {
            return new Request(this);
        }

        public Builder newRequset(Request request) {
            this.name = request.name;
            this.day = request.day;
            this.reason = request.reason;
            if (request.groupLeaderInfo != null
                    && !request.groupLeaderInfo.equals("")) {
                this.groupLeaderInfo = request.groupLeaderInfo;
            }

            if (request.managerInfo != null && !request.managerInfo.equals("")) {
                this.managerInfo = request.managerInfo;
            }

            if (request.departmentHeaderInfo != null
                    && !request.departmentHeaderInfo.equals("")) {
                this.departmentHeaderInfo = request.departmentHeaderInfo;
            }

            if (request.coustomInfo != null && !request.coustomInfo.equals("")) {
                this.coustomInfo = request.coustomInfo;
            }
            return this;

        }
    }

    public String getName() {
        return name;
    }

    public String getReason() {
        return reason;
    }

    public int getDay() {
        return day;
    }

    public String getGroupLeaderInfo() {
        return groupLeaderInfo;
    }

    public String getManagerInfo() {
        return managerInfo;
    }

    public String getDepartmentHeaderInfo() {
        return departmentHeaderInfo;
    }

    public String getCoustomInfo() {
        return coustomInfo;
    }


    @Override
    public String toString() {
        return "Request{" +
                "name='" + name + '\'' +
                ", reason='" + reason + '\'' +
                ", day=" + day +
                ", groupLeaderInfo='" + groupLeaderInfo + '\'' +
                ", managerInfo='" + managerInfo + '\'' +
                ", departmentHeaderInfo='" + departmentHeaderInfo + '\'' +
                ", coustomInfo='" + coustomInfo + '\'' +
                '}';
    }
}
