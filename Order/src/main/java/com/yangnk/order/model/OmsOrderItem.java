package com.yangnk.order.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class OmsOrderItem implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column oms_order_item.id
     *
     * @mbggenerated Wed May 17 15:25:29 CST 2023
     */
    private Long id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column oms_order_item.order_id
     *
     * @mbggenerated Wed May 17 15:25:29 CST 2023
     */
    private Long orderId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column oms_order_item.order_sn
     *
     * @mbggenerated Wed May 17 15:25:29 CST 2023
     */
    private String orderSn;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column oms_order_item.product_id
     *
     * @mbggenerated Wed May 17 15:25:29 CST 2023
     */
    private Long productId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column oms_order_item.product_pic
     *
     * @mbggenerated Wed May 17 15:25:29 CST 2023
     */
    private String productPic;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column oms_order_item.product_name
     *
     * @mbggenerated Wed May 17 15:25:29 CST 2023
     */
    private String productName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column oms_order_item.product_brand
     *
     * @mbggenerated Wed May 17 15:25:29 CST 2023
     */
    private String productBrand;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column oms_order_item.product_sn
     *
     * @mbggenerated Wed May 17 15:25:29 CST 2023
     */
    private String productSn;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column oms_order_item.product_price
     *
     * @mbggenerated Wed May 17 15:25:29 CST 2023
     */
    private BigDecimal productPrice;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column oms_order_item.product_quantity
     *
     * @mbggenerated Wed May 17 15:25:29 CST 2023
     */
    private Integer productQuantity;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column oms_order_item.product_sku_id
     *
     * @mbggenerated Wed May 17 15:25:29 CST 2023
     */
    private Long productSkuId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column oms_order_item.product_sku_code
     *
     * @mbggenerated Wed May 17 15:25:29 CST 2023
     */
    private String productSkuCode;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column oms_order_item.product_category_id
     *
     * @mbggenerated Wed May 17 15:25:29 CST 2023
     */
    private Long productCategoryId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column oms_order_item.sp1
     *
     * @mbggenerated Wed May 17 15:25:29 CST 2023
     */
    private String sp1;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column oms_order_item.sp2
     *
     * @mbggenerated Wed May 17 15:25:29 CST 2023
     */
    private String sp2;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column oms_order_item.sp3
     *
     * @mbggenerated Wed May 17 15:25:29 CST 2023
     */
    private String sp3;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column oms_order_item.promotion_name
     *
     * @mbggenerated Wed May 17 15:25:29 CST 2023
     */
    private String promotionName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column oms_order_item.promotion_amount
     *
     * @mbggenerated Wed May 17 15:25:29 CST 2023
     */
    private BigDecimal promotionAmount;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column oms_order_item.coupon_amount
     *
     * @mbggenerated Wed May 17 15:25:29 CST 2023
     */
    private BigDecimal couponAmount;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column oms_order_item.integration_amount
     *
     * @mbggenerated Wed May 17 15:25:29 CST 2023
     */
    private BigDecimal integrationAmount;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column oms_order_item.real_amount
     *
     * @mbggenerated Wed May 17 15:25:29 CST 2023
     */
    private BigDecimal realAmount;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column oms_order_item.gift_integration
     *
     * @mbggenerated Wed May 17 15:25:29 CST 2023
     */
    private Integer giftIntegration;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column oms_order_item.gift_growth
     *
     * @mbggenerated Wed May 17 15:25:29 CST 2023
     */
    private Integer giftGrowth;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column oms_order_item.product_attr
     *
     * @mbggenerated Wed May 17 15:25:29 CST 2023
     */
    private String productAttr;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column oms_order_item.gmt_create
     *
     * @mbggenerated Wed May 17 15:25:29 CST 2023
     */
    private Date gmtCreate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column oms_order_item.gmt_modified
     *
     * @mbggenerated Wed May 17 15:25:29 CST 2023
     */
    private Date gmtModified;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table oms_order_item
     *
     * @mbggenerated Wed May 17 15:25:29 CST 2023
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column oms_order_item.id
     *
     * @return the value of oms_order_item.id
     *
     * @mbggenerated Wed May 17 15:25:29 CST 2023
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column oms_order_item.id
     *
     * @param id the value for oms_order_item.id
     *
     * @mbggenerated Wed May 17 15:25:29 CST 2023
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column oms_order_item.order_id
     *
     * @return the value of oms_order_item.order_id
     *
     * @mbggenerated Wed May 17 15:25:29 CST 2023
     */
    public Long getOrderId() {
        return orderId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column oms_order_item.order_id
     *
     * @param orderId the value for oms_order_item.order_id
     *
     * @mbggenerated Wed May 17 15:25:29 CST 2023
     */
    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column oms_order_item.order_sn
     *
     * @return the value of oms_order_item.order_sn
     *
     * @mbggenerated Wed May 17 15:25:29 CST 2023
     */
    public String getOrderSn() {
        return orderSn;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column oms_order_item.order_sn
     *
     * @param orderSn the value for oms_order_item.order_sn
     *
     * @mbggenerated Wed May 17 15:25:29 CST 2023
     */
    public void setOrderSn(String orderSn) {
        this.orderSn = orderSn;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column oms_order_item.product_id
     *
     * @return the value of oms_order_item.product_id
     *
     * @mbggenerated Wed May 17 15:25:29 CST 2023
     */
    public Long getProductId() {
        return productId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column oms_order_item.product_id
     *
     * @param productId the value for oms_order_item.product_id
     *
     * @mbggenerated Wed May 17 15:25:29 CST 2023
     */
    public void setProductId(Long productId) {
        this.productId = productId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column oms_order_item.product_pic
     *
     * @return the value of oms_order_item.product_pic
     *
     * @mbggenerated Wed May 17 15:25:29 CST 2023
     */
    public String getProductPic() {
        return productPic;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column oms_order_item.product_pic
     *
     * @param productPic the value for oms_order_item.product_pic
     *
     * @mbggenerated Wed May 17 15:25:29 CST 2023
     */
    public void setProductPic(String productPic) {
        this.productPic = productPic;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column oms_order_item.product_name
     *
     * @return the value of oms_order_item.product_name
     *
     * @mbggenerated Wed May 17 15:25:29 CST 2023
     */
    public String getProductName() {
        return productName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column oms_order_item.product_name
     *
     * @param productName the value for oms_order_item.product_name
     *
     * @mbggenerated Wed May 17 15:25:29 CST 2023
     */
    public void setProductName(String productName) {
        this.productName = productName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column oms_order_item.product_brand
     *
     * @return the value of oms_order_item.product_brand
     *
     * @mbggenerated Wed May 17 15:25:29 CST 2023
     */
    public String getProductBrand() {
        return productBrand;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column oms_order_item.product_brand
     *
     * @param productBrand the value for oms_order_item.product_brand
     *
     * @mbggenerated Wed May 17 15:25:29 CST 2023
     */
    public void setProductBrand(String productBrand) {
        this.productBrand = productBrand;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column oms_order_item.product_sn
     *
     * @return the value of oms_order_item.product_sn
     *
     * @mbggenerated Wed May 17 15:25:29 CST 2023
     */
    public String getProductSn() {
        return productSn;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column oms_order_item.product_sn
     *
     * @param productSn the value for oms_order_item.product_sn
     *
     * @mbggenerated Wed May 17 15:25:29 CST 2023
     */
    public void setProductSn(String productSn) {
        this.productSn = productSn;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column oms_order_item.product_price
     *
     * @return the value of oms_order_item.product_price
     *
     * @mbggenerated Wed May 17 15:25:29 CST 2023
     */
    public BigDecimal getProductPrice() {
        return productPrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column oms_order_item.product_price
     *
     * @param productPrice the value for oms_order_item.product_price
     *
     * @mbggenerated Wed May 17 15:25:29 CST 2023
     */
    public void setProductPrice(BigDecimal productPrice) {
        this.productPrice = productPrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column oms_order_item.product_quantity
     *
     * @return the value of oms_order_item.product_quantity
     *
     * @mbggenerated Wed May 17 15:25:29 CST 2023
     */
    public Integer getProductQuantity() {
        return productQuantity;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column oms_order_item.product_quantity
     *
     * @param productQuantity the value for oms_order_item.product_quantity
     *
     * @mbggenerated Wed May 17 15:25:29 CST 2023
     */
    public void setProductQuantity(Integer productQuantity) {
        this.productQuantity = productQuantity;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column oms_order_item.product_sku_id
     *
     * @return the value of oms_order_item.product_sku_id
     *
     * @mbggenerated Wed May 17 15:25:29 CST 2023
     */
    public Long getProductSkuId() {
        return productSkuId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column oms_order_item.product_sku_id
     *
     * @param productSkuId the value for oms_order_item.product_sku_id
     *
     * @mbggenerated Wed May 17 15:25:29 CST 2023
     */
    public void setProductSkuId(Long productSkuId) {
        this.productSkuId = productSkuId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column oms_order_item.product_sku_code
     *
     * @return the value of oms_order_item.product_sku_code
     *
     * @mbggenerated Wed May 17 15:25:29 CST 2023
     */
    public String getProductSkuCode() {
        return productSkuCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column oms_order_item.product_sku_code
     *
     * @param productSkuCode the value for oms_order_item.product_sku_code
     *
     * @mbggenerated Wed May 17 15:25:29 CST 2023
     */
    public void setProductSkuCode(String productSkuCode) {
        this.productSkuCode = productSkuCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column oms_order_item.product_category_id
     *
     * @return the value of oms_order_item.product_category_id
     *
     * @mbggenerated Wed May 17 15:25:29 CST 2023
     */
    public Long getProductCategoryId() {
        return productCategoryId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column oms_order_item.product_category_id
     *
     * @param productCategoryId the value for oms_order_item.product_category_id
     *
     * @mbggenerated Wed May 17 15:25:29 CST 2023
     */
    public void setProductCategoryId(Long productCategoryId) {
        this.productCategoryId = productCategoryId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column oms_order_item.sp1
     *
     * @return the value of oms_order_item.sp1
     *
     * @mbggenerated Wed May 17 15:25:29 CST 2023
     */
    public String getSp1() {
        return sp1;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column oms_order_item.sp1
     *
     * @param sp1 the value for oms_order_item.sp1
     *
     * @mbggenerated Wed May 17 15:25:29 CST 2023
     */
    public void setSp1(String sp1) {
        this.sp1 = sp1;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column oms_order_item.sp2
     *
     * @return the value of oms_order_item.sp2
     *
     * @mbggenerated Wed May 17 15:25:29 CST 2023
     */
    public String getSp2() {
        return sp2;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column oms_order_item.sp2
     *
     * @param sp2 the value for oms_order_item.sp2
     *
     * @mbggenerated Wed May 17 15:25:29 CST 2023
     */
    public void setSp2(String sp2) {
        this.sp2 = sp2;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column oms_order_item.sp3
     *
     * @return the value of oms_order_item.sp3
     *
     * @mbggenerated Wed May 17 15:25:29 CST 2023
     */
    public String getSp3() {
        return sp3;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column oms_order_item.sp3
     *
     * @param sp3 the value for oms_order_item.sp3
     *
     * @mbggenerated Wed May 17 15:25:29 CST 2023
     */
    public void setSp3(String sp3) {
        this.sp3 = sp3;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column oms_order_item.promotion_name
     *
     * @return the value of oms_order_item.promotion_name
     *
     * @mbggenerated Wed May 17 15:25:29 CST 2023
     */
    public String getPromotionName() {
        return promotionName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column oms_order_item.promotion_name
     *
     * @param promotionName the value for oms_order_item.promotion_name
     *
     * @mbggenerated Wed May 17 15:25:29 CST 2023
     */
    public void setPromotionName(String promotionName) {
        this.promotionName = promotionName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column oms_order_item.promotion_amount
     *
     * @return the value of oms_order_item.promotion_amount
     *
     * @mbggenerated Wed May 17 15:25:29 CST 2023
     */
    public BigDecimal getPromotionAmount() {
        return promotionAmount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column oms_order_item.promotion_amount
     *
     * @param promotionAmount the value for oms_order_item.promotion_amount
     *
     * @mbggenerated Wed May 17 15:25:29 CST 2023
     */
    public void setPromotionAmount(BigDecimal promotionAmount) {
        this.promotionAmount = promotionAmount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column oms_order_item.coupon_amount
     *
     * @return the value of oms_order_item.coupon_amount
     *
     * @mbggenerated Wed May 17 15:25:29 CST 2023
     */
    public BigDecimal getCouponAmount() {
        return couponAmount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column oms_order_item.coupon_amount
     *
     * @param couponAmount the value for oms_order_item.coupon_amount
     *
     * @mbggenerated Wed May 17 15:25:29 CST 2023
     */
    public void setCouponAmount(BigDecimal couponAmount) {
        this.couponAmount = couponAmount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column oms_order_item.integration_amount
     *
     * @return the value of oms_order_item.integration_amount
     *
     * @mbggenerated Wed May 17 15:25:29 CST 2023
     */
    public BigDecimal getIntegrationAmount() {
        return integrationAmount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column oms_order_item.integration_amount
     *
     * @param integrationAmount the value for oms_order_item.integration_amount
     *
     * @mbggenerated Wed May 17 15:25:29 CST 2023
     */
    public void setIntegrationAmount(BigDecimal integrationAmount) {
        this.integrationAmount = integrationAmount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column oms_order_item.real_amount
     *
     * @return the value of oms_order_item.real_amount
     *
     * @mbggenerated Wed May 17 15:25:29 CST 2023
     */
    public BigDecimal getRealAmount() {
        return realAmount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column oms_order_item.real_amount
     *
     * @param realAmount the value for oms_order_item.real_amount
     *
     * @mbggenerated Wed May 17 15:25:29 CST 2023
     */
    public void setRealAmount(BigDecimal realAmount) {
        this.realAmount = realAmount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column oms_order_item.gift_integration
     *
     * @return the value of oms_order_item.gift_integration
     *
     * @mbggenerated Wed May 17 15:25:29 CST 2023
     */
    public Integer getGiftIntegration() {
        return giftIntegration;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column oms_order_item.gift_integration
     *
     * @param giftIntegration the value for oms_order_item.gift_integration
     *
     * @mbggenerated Wed May 17 15:25:29 CST 2023
     */
    public void setGiftIntegration(Integer giftIntegration) {
        this.giftIntegration = giftIntegration;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column oms_order_item.gift_growth
     *
     * @return the value of oms_order_item.gift_growth
     *
     * @mbggenerated Wed May 17 15:25:29 CST 2023
     */
    public Integer getGiftGrowth() {
        return giftGrowth;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column oms_order_item.gift_growth
     *
     * @param giftGrowth the value for oms_order_item.gift_growth
     *
     * @mbggenerated Wed May 17 15:25:29 CST 2023
     */
    public void setGiftGrowth(Integer giftGrowth) {
        this.giftGrowth = giftGrowth;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column oms_order_item.product_attr
     *
     * @return the value of oms_order_item.product_attr
     *
     * @mbggenerated Wed May 17 15:25:29 CST 2023
     */
    public String getProductAttr() {
        return productAttr;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column oms_order_item.product_attr
     *
     * @param productAttr the value for oms_order_item.product_attr
     *
     * @mbggenerated Wed May 17 15:25:29 CST 2023
     */
    public void setProductAttr(String productAttr) {
        this.productAttr = productAttr;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column oms_order_item.gmt_create
     *
     * @return the value of oms_order_item.gmt_create
     *
     * @mbggenerated Wed May 17 15:25:29 CST 2023
     */
    public Date getGmtCreate() {
        return gmtCreate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column oms_order_item.gmt_create
     *
     * @param gmtCreate the value for oms_order_item.gmt_create
     *
     * @mbggenerated Wed May 17 15:25:29 CST 2023
     */
    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column oms_order_item.gmt_modified
     *
     * @return the value of oms_order_item.gmt_modified
     *
     * @mbggenerated Wed May 17 15:25:29 CST 2023
     */
    public Date getGmtModified() {
        return gmtModified;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column oms_order_item.gmt_modified
     *
     * @param gmtModified the value for oms_order_item.gmt_modified
     *
     * @mbggenerated Wed May 17 15:25:29 CST 2023
     */
    public void setGmtModified(Date gmtModified) {
        this.gmtModified = gmtModified;
    }
}