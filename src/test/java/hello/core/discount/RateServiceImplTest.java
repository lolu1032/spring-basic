package hello.core.discount;

import hello.core.discount.DiscountPolicy;
import hello.core.discount.FixDiscountPolicy;
import hello.core.member.Grade;
import hello.core.member.Member;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.stereotype.Component;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;
@Component
class RateServiceImplTest {
    DiscountPolicy discountPolicy = new FixDiscountPolicy();
    @Test
    @DisplayName("VIP일시 10퍼할인")
    void vip_o() {
        //given
        Member member = new Member(1L,"memberA", Grade.VIP);
        //when
        int discount = discountPolicy.discount(member,10000);
        //then
        assertThat(discount).isEqualTo(1000);
    }
    @Test
    @DisplayName("VIP아닐시 할인이 적용안된다")
    void vip_x() {
        // given
        Member member = new Member(2L,"memberB",Grade.BASIC);
        // when
        int discount = discountPolicy.discount(member,10000);
        // then
        assertThat(discount).isEqualTo(0);
    }
}