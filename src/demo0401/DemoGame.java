package demo0401;

public class DemoGame {
    public static void main(String[] args) {
        Hero hero = new Hero();
        hero.setName("艾伦"); //设置英雄的名称

        //方法一
        //设置英雄技能
//        hero.setSkill(new SkillImpl());  //使用单独定义的实现类

        //方法二
        //还可改成使用匿名内部类
//        Skill skill = new Skill() {
//            @Override
//            public void use() {
//                System.out.println("Pia~pia~pia");
//            }
//        };
//        hero.setSkill(skill);

        //方法三
        //进一步简化，同时所使用匿名内部类和匿名对象
        hero.setSkill((new Skill() {
            @Override
            public void use() {
                System.out.println("Biu~pia~biu~pia");
            }
        }));

        hero.attack();
    }
}
