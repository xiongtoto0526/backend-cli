fork from :
https://github.com/ocubexo/springboot-restful-starter
以模块为维度，将所有业务包按business进行划分。每个business下有各自的controller/service/entity
包结构说明：
- auth: 鉴权相关，包含jwt
- base: 基础配置
- user: 用户相关，signIn,singUp
- dami: 业务包

三步即可开发：
1. 导入工程，使用idea的refactor功能，将"company.business"的packageName重命名为"yourFirstPackage.yourSecondPackage"
   同时，修改 Application中的 @MapperScan({"com.quadtalent.business"})
2. 在db中建立对应的表(执行init.sql即可)
3. 测试接口：先signIn,然后header中填写 Access-token
4. 开始开发：执行 test/java/CodeGenerator,生成代码

代码说明：
1. 鉴权方式jwt。base/config/InterceptorConfig中配置了需要鉴权的url
2. @Auth注解，可以拿到userId
3. resource/templates 可以自行修改，便于自定义生成代码片段（freemarker对应ftl文件）

- todo:
1. 待集成swaggerUI
