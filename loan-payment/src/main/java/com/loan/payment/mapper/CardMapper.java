package com.loan.payment.mapper;

import com.loan_entity.app.Card;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;
import java.util.Map;

public interface CardMapper extends Mapper<Card> {
    List<Card> quertCard(Map<String, Object> map);
}
