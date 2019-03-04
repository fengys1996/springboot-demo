package com.dlut.gson.entity;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

public class User
{
    @SerializedName("Age")
    private int m_Age;

    @SerializedName("Name")
    private String m_Name;

    @SerializedName("VisitType")
    private List<Long> m_objVisitTypeList;

    public List getVisitTypeList()
    {
        return m_objVisitTypeList;
    }

    public void setVisitTypeList(List list)
    {
        this.m_objVisitTypeList = list;
    }

    public int getAge()
    {
        return m_Age;
    }

    public void setAge(int age)
    {
        this.m_Age = age;
    }

    public String getName()
    {
        return m_Name;
    }

    public void setName(String name)
    {
        this.m_Name = name;
    }
}
