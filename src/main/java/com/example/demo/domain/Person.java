package com.example.demo.domain;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * @ConfigurationProperties:表明本类中的所有属性与spring的相关配置进行绑定。
 * prefix：表明与Application.yml中的哪一个配置进行绑定。
 *
 * @Component：只有是容器中的组件，才能使用组件中的功能。
 * @Component==<bean></>
 *
 * @PropertySource:告诉springboot加载类路径下的person.properties并绑定到这个类中。
 */

@PropertySource(value = {"classpath:classProperties/person.properties"})
@Component
@ConfigurationProperties(prefix = "person")
/*数据校验*/
@Validated
public class Person {
    /**
     * <bean>的三种书写方式
     * <bean>
     *   <properties name="" pass="" /${key}::表示从环境变量、配置环境中获取值//#{SpeL}::spring表达式>
     *
     *   </properties>
     *
     * </bean>
     */
   /*
   * @Email 配和@Validated进行数据校验
   * */
  /* @Value("${person.name}")*/
    private String name;
    /*SpeL表达式*/
    /*@Value("#{11+2*3}")*/
    private Integer age;
    private boolean boss;
    private Date birth;

    private Map<String,Object> map;
    private List<Dog> list;

    private Dog dog;


    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", boss=" + boss +
                ", birth=" + birth +
                ", map=" + map +
                ", list=" + list +
                ", dog=" + dog +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public boolean isBoss() {
        return boss;
    }

    public void setBoss(boolean boss) {
        this.boss = boss;
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    public Map getMap() {
        return map;
    }

    public void setMap(Map map) {
        this.map = map;
    }

    public List getList() {
        return list;
    }

    public void setList(List list) {
        this.list = list;
    }

    public Dog getDog() {
        return dog;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }
}
