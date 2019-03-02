package com.onlineanswer.hc.answer.entity;

import com.baomidou.mybatisplus.enums.IdType;
import com.baomidou.mybatisplus.annotations.TableId;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author zqw
 * @since 2019-03-02
 */
public class Realtimeanswer implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 学生ID
     */
    private Integer studentid;
    /**
     * 题目类型ID
     */
    private Integer examtypeid;
    /**
     * 题目ID
     */
    private Integer examinfoid;
    /**
     * 题目类型名称
     */
    private String examtypename;
    /**
     * 题目问题
     */
    private String examtypeinfo;
    /**
     * 学生姓名
     */
    private String studentname;
    /**
     * 学生回答
     */
    private String studentanswer;
    /**
     * 正确答案
     */
    private String correctanswer;
    /**
     * 是否正确
     */
    private String istrue;
    /**
     * 学生账号
     */
    private String studentlogin;
    /**
     * 主键ID
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;


    public Integer getStudentid() {
        return studentid;
    }

    public void setStudentid(Integer studentid) {
        this.studentid = studentid;
    }

    public Integer getExamtypeid() {
        return examtypeid;
    }

    public void setExamtypeid(Integer examtypeid) {
        this.examtypeid = examtypeid;
    }

    public Integer getExaminfoid() {
        return examinfoid;
    }

    public void setExaminfoid(Integer examinfoid) {
        this.examinfoid = examinfoid;
    }

    public String getExamtypename() {
        return examtypename;
    }

    public void setExamtypename(String examtypename) {
        this.examtypename = examtypename;
    }

    public String getExamtypeinfo() {
        return examtypeinfo;
    }

    public void setExamtypeinfo(String examtypeinfo) {
        this.examtypeinfo = examtypeinfo;
    }

    public String getStudentname() {
        return studentname;
    }

    public void setStudentname(String studentname) {
        this.studentname = studentname;
    }

    public String getStudentanswer() {
        return studentanswer;
    }

    public void setStudentanswer(String studentanswer) {
        this.studentanswer = studentanswer;
    }

    public String getCorrectanswer() {
        return correctanswer;
    }

    public void setCorrectanswer(String correctanswer) {
        this.correctanswer = correctanswer;
    }

    public String getIstrue() {
        return istrue;
    }

    public void setIstrue(String istrue) {
        this.istrue = istrue;
    }

    public String getStudentlogin() {
        return studentlogin;
    }

    public void setStudentlogin(String studentlogin) {
        this.studentlogin = studentlogin;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Realtimeanswer{" +
        ", studentid=" + studentid +
        ", examtypeid=" + examtypeid +
        ", examinfoid=" + examinfoid +
        ", examtypename=" + examtypename +
        ", examtypeinfo=" + examtypeinfo +
        ", studentname=" + studentname +
        ", studentanswer=" + studentanswer +
        ", correctanswer=" + correctanswer +
        ", istrue=" + istrue +
        ", studentlogin=" + studentlogin +
        ", id=" + id +
        "}";
    }
}
