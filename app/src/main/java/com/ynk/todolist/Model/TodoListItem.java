package com.ynk.todolist.Model;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

import java.util.Date;

@Entity(tableName = "todolistitem")
public class TodoListItem {

    @PrimaryKey
    private Long listItemId;

    @ColumnInfo
    private String listId;

    @ColumnInfo
    private String listItemName;

    @ColumnInfo
    private String listItemDesc;

    @ColumnInfo
    private Date listItemCreateDate;

    @ColumnInfo
    private String listItemStatusName;

    private boolean isExpanded;//Definition For Expandable RecyclerView

    public Long getListItemId() {
        return listItemId;
    }

    public void setListItemId(Long listItemId) {
        this.listItemId = listItemId;
    }

    @ColumnInfo
    private Date listItemDeadline;

    @ColumnInfo
    private int listItemStatusCode;

    public String getListId() {
        return listId;
    }

    public void setListId(String listId) {
        this.listId = listId;
    }

    public Date getListItemDeadline() {
        return listItemDeadline;
    }

    public void setListItemDeadline(Date listItemDeadline) {
        this.listItemDeadline = listItemDeadline;
    }

    public int getListItemStatusCode() {
        return listItemStatusCode;
    }

    public void setListItemStatusCode(int listItemStatusCode) {
        this.listItemStatusCode = listItemStatusCode;
    }

    public String getListItemName() {
        return listItemName;
    }

    public void setListItemName(String listItemName) {
        this.listItemName = listItemName;
    }

    public String getListItemDesc() {
        return listItemDesc;
    }

    public void setListItemDesc(String listItemDesc) {
        this.listItemDesc = listItemDesc;
    }

    public Date getListItemCreateDate() {
        return listItemCreateDate;
    }

    public void setListItemCreateDate(Date listItemCreateDate) {
        this.listItemCreateDate = listItemCreateDate;
    }

    public String getListItemStatusName() {
        return listItemStatusName;
    }

    public void setListItemStatusName(String listItemStatusName) {
        this.listItemStatusName = listItemStatusName;
    }

    public boolean isExpanded() {
        return isExpanded;
    }

    public void setExpanded(boolean expanded) {
        isExpanded = expanded;
    }
}
