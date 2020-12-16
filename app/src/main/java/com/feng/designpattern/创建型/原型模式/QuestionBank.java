package com.feng.designpattern.创建型.原型模式;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;

/**
 * Created by fengbei
 * on 20-10-26
 * <p>
 * 题库的实体类
 */
public class QuestionBank implements Cloneable {

    //  考号
    private String studentName;
    //  考号
    private String number;

    private ArrayList<ChoiceQuestion> choiceQuestions = new ArrayList();
    private ArrayList<AnswerQuestion> answerQuestions = new ArrayList();

    @Override
    protected Object clone() throws CloneNotSupportedException {
        QuestionBank questionBank = (QuestionBank) super.clone();
        //  此处为深clone ，非基本数据类型都需求调用clone接口
        questionBank.choiceQuestions = (ArrayList<ChoiceQuestion>) choiceQuestions.clone();
        questionBank.answerQuestions = (ArrayList<AnswerQuestion>) answerQuestions.clone();

        //  题目乱序
        Collections.shuffle(choiceQuestions);
        Collections.shuffle(answerQuestions);

        //   答案乱序


        return questionBank;

    }


    public QuestionBank append(ChoiceQuestion choiceQuestion) {
        choiceQuestions.add(choiceQuestion);
        return this;
    }

    public QuestionBank append(AnswerQuestion answerQuestion) {
        answerQuestions.add(answerQuestion);
        return this;
    }


    public void setCandidate(String candidate) {
        this.studentName = candidate;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    @Override
    public String toString() {

        StringBuilder detail = new StringBuilder("考生：" + studentName + "\r\n" +
                "考号：" + number + "\r\n" +
                "--------------------------------------------\r\n" +
                "一、选择题" + "\r\n\n");

        for (int idx = 0; idx < choiceQuestions.size(); idx++) {
            detail.append("第").append(idx + 1).append("题：").append(choiceQuestions.get(idx).getName()).append("\r\n");
            Map<String, String> option = choiceQuestions.get(idx).getOption();
            for (String key : option.keySet()) {
                detail.append(key).append("：").append(option.get(key)).append("\r\n");
            }
            detail.append("答案：").append(choiceQuestions.get(idx).getKey()).append("\r\n\n");
        }

        detail.append("二、问答题" + "\r\n\n");

        for (int idx = 0; idx < answerQuestions.size(); idx++) {
            detail.append("第").append(idx + 1).append("题：").append(answerQuestions.get(idx).getName()).append("\r\n");
            detail.append("答案：").append(answerQuestions.get(idx).getKey()).append("\r\n\n");
        }

        return detail.toString();
    }

}
