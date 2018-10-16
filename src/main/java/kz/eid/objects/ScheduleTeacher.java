/*
 * Copyright 2018 EDVAM
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package kz.eid.objects;

import com.google.gson.annotations.SerializedName;

public class ScheduleTeacher {
    @SerializedName("id_schedule")
    private int id_schedule;
    @SerializedName("d")
    private int d;
    @SerializedName("num")
    private int num;
    @SerializedName("subject")
    private String subject;
    @SerializedName("type")
    private int type;
    @SerializedName("id_group")
    private int id_group;
    @SerializedName("name")
    private String name;
    @SerializedName("room")
    private String room;
    @SerializedName("change")
    private int change;

    public void setId_schedule(int id_schedule) {
        this.id_schedule = id_schedule;
    }

    public void setD(int d) {
        this.d = d;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void setType(int type) {
        this.type = type;
    }

    public void setId_group(int id_group) {
        this.id_group = id_group;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRoom(String room) {
        this.room = room;
    }

    public void setChange(int change) {
        this.change = change;
    }
}