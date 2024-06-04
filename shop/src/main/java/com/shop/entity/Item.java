package com.shop.entity;

import com.shop.constant.ItemSellStatus;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.time.LocalDateTime;

@Setter
@Getter
@ToString
@Entity
@Table(name="item")
public class Item {

    @Id
    @Column(name = "item_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;    //상품코드

    @Column(nullable = false, length = 50)
    private String itemNm;   //상품명

    @Column(name = "price", nullable = false)
    private int price;  //가격

    @Column(nullable = false)
    private int stoackNumber;  //재고수량

    @Lob
    @Column(nullable = false)
    private String itemDetail; //상품 상세설명

    @Enumerated(EnumType.STRING)
    private ItemSellStatus itemSellStatus; //상품 판매 상태

    private LocalDateTime regTime;   //등록 시간

    private LocalDateTime updateTime; //수정 시간
}