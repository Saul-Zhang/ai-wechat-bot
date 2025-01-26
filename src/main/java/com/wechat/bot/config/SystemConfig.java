package com.wechat.bot.config;

import lombok.*;



/**
 * @author Alex
 * @since 2025/1/26 14:34
 * <p></p>
 */

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class SystemConfig {


    private String token;

    private String appId;

    private String callbackUrl;

    private String downloadUrl;

    private String baseUrl;



}
