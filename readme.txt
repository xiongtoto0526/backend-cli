fork from :
https://github.com/ocubexo/springboot-restful-starter

做了一些改造，便于实际使用。

三步即可开发：
1. 导入工程，使用idea的refactor功能，将"company.business"的packageName重命名为"yourFirstPackage.yourSecondPackage"
   同时，修改 Application中的 @MapperScan({"com.company.business"})
2. 在db中建立对应的表
3. 执行 test/java/CodeGenerator,生成代码

代码说明：
1. 鉴权方式jwt。base/config/InterceptorConfig中配置了需要鉴权的url
2. @Auth注解，可以拿到userId
3. fight包下是测试demo
4. resource/templates 可以自行修改，便于自定义生成代码片段（freemarker对应ftl文件）

todo:
1. 待集成swaggerUI