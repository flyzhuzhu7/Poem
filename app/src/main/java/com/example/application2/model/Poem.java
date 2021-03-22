package com.example.application2.model;

import java.util.List;

public class Poem {
    /**
     * _id : {"$oid":"5b9a0136367d5c96f4cd295a"}
     * title : 木兰诗 / 木兰辞
     * dynasty : 南北朝
     * writer : 佚名
     * content : 　　唧唧复唧唧，木兰当户织。不闻机杼声，惟闻女叹息。(’惟‘闻 通：唯)问女何所思，问女何所忆。女亦无所思，女亦无所忆。昨夜见军帖，可汗大点兵，军书十二卷，卷卷有爷名。阿爷无大儿，木兰无长兄，愿为市鞍马，从此替爷征。

     　　东市买骏马，西市买鞍鞯，南市买辔头，北市买长鞭。旦辞爷娘去，暮宿黄河边，不闻爷娘唤女声，但闻黄河流水鸣溅溅。旦辞黄河去，暮至黑山头，不闻爷娘唤女声，但闻燕山胡骑鸣啾啾。

     　　万里赴戎机，关山度若飞。朔气传金柝，寒光照铁衣。将军百战死，壮士十年归。

     　　归来见天子，天子坐明堂。策勋十二转，赏赐百千强。可汗问所欲，木兰不用尚书郎，愿驰千里足，送儿还故乡。(一作：愿借明驼千里足)

     　　爷娘闻女来，出郭相扶将；阿姊闻妹来，当户理红妆；小弟闻姊来，磨刀霍霍向猪羊。开我东阁门，坐我西阁床，脱我战时袍，著我旧时裳。当窗理云鬓，对镜帖花黄。出门看火伴，火伴皆惊忙：同行十二年，不知木兰是女郎。（’帖‘ 通：贴；惊’忙‘ 一作：惶；'火'伴 通：伙）

     　　雄兔脚扑朔，雌兔眼迷离；双兔傍地走，安能辨我是雄雌？
     * type : ["初中古诗","初中文言文","乐府","叙事","民歌","赞美","女子","战争"]
     * remark : 唧唧（jī jī）：纺织机的声音。一说为叹息声，意思是木兰无心织布，停机叹息。
     当户（dāng hù）：对着门。
     机杼（zhù）声：织布机发出的声音。机：指织布机。杼：织布梭（suō）子。
     惟：只。
     何：什么。
     忆：思念，惦记
     军帖（tiě)：征兵的文书。
     可汗（kè hán）：古代西北地区民族对君主的称呼
     军书十二卷：征兵的名册很多卷。十二，表示很多，不是确指。下文的“十二转”、“十二年”，用法与此相同。
     爷：和下文的“阿爷”一样，都指父亲。
     愿为市鞍(ān）马：为，为此。市，买。鞍马，泛指马和马具。
     鞯（jiān）：马鞍下的垫子。
     辔（pèi)头：驾驭牲口用的嚼子、笼头和缰绳。
     辞：离开，辞行。
     溅溅（jiān jiān）：水流激射的声音。
     旦：早晨。
     但闻：只听见
     胡骑（jì）：胡人的战马。胡，古代对北方少数民族的称呼。
     啾啾（jiū jiū）：马叫的声音。
     天子：即前面所说的“可汗”。
     万里赴戎机：不远万里，奔赴战场。戎机：指战争。
     关山度若飞：像飞一样地跨过一道道的关，越过一座座的山。度，越过。
     朔(shuò)气传金柝：北方的寒气传送着打更的声音。朔，北方。金柝（tuò），即刁斗。古代军中用的一种铁锅，白天用来做饭，晚上用来报更。
     寒光照铁衣：冰冷的月光照在将士们的铠甲上。
     明堂：明亮的的厅堂，此处指宫殿
     策勋十二转(zhuǎn)：记很大的功。策勋，记功。转，勋级每升一级叫一转，十二转为最高的勋级。十二转：不是确数，形容功劳极高。
     赏赐百千强(qiáng）：赏赐很多的财物。百千：形容数量多。强，有余。
     问所欲：问（木兰）想要什么。
     不用：不愿意做。
     尚书郎：尚书省的官。尚书省是古代朝廷中管理国家政事的机关。
     愿驰千里足：希望骑上千里马。
     郭：外城。
     扶：扶持。将：助词，不译。
     姊（zǐ）：姐姐。
     理：梳理。
     红妆（zhuāng）：指女子的艳丽装束。
     霍霍（huò huò）：模拟磨刀的声音。
     著(zhuó)：通假字 通“着”，穿。
     云鬓（bìn）：像云那样的鬓发，形容好看的头发。
     帖（tiē）花黄：帖”通假字 通“贴”。花黄，古代妇女的一种面部装饰物。
     雄兔脚扑朔，雌兔眼迷离：据说，提着兔子的耳朵悬在半空时，雄兔两只前脚时时动弹，雌兔两只眼睛时常眯着，所以容易辨认。扑朔，爬搔，扑腾。迷离，眯着眼。
     双兔傍地走，安能辨我是雄雌：两只兔子贴着地面跑，怎能辨别哪个是雄兔，哪个是雌兔呢？　42. “火”：通“伙”。古时一起打仗的人用同一个锅吃饭，后意译为同行的人。
     行：读háng。
     傍(bàng)地走：贴着地面并排跑。
     * shangxi : 　　北朝长篇叙事民歌。它的产生年代及作者，从宋代起，就有不同记载和争议。始见于《文苑英华》，题为《木兰歌》，以为唐代韦元甫所作。《古文苑》题为《木兰诗》，以为“唐人诗”。宋代程大昌《演繁露》据诗中“可汗大点兵”语，认为木兰“生世非隋即唐”；而南宋严羽《沧浪诗话》则认为“朔气传金柝，寒光照铁衣”之类，“已似太白，必非汉魏人诗”。此后，历代都有人持“隋、唐人作”之说，但宋代黄庭坚已指出此诗并非韦元甫所作，而是韦“得于民间”（《题乐府〈木兰诗〉后》）。《乐府诗集》列入《梁鼓角横吹曲》，亦题《木兰诗》，云是“古辞”，并引陈释智匠《古今乐录》说：“木兰，不知名。”按《旧唐书·韦元甫传》载，韦曾任浙西观察使、淮南节度使等职（黄庭坚谓韦任朔方节度使，误）。又据《旧唐书·音乐志》所载，可知梁代和北朝乐府歌曲中都存有“燕、魏之际鲜卑歌”，且多“可汗之辞”。因此，《木兰诗》原先也可能是一首鲜卑歌。流传江南，译为汉语，曾入梁代乐府，后又散落民间，而到唐代为韦元甫重新发现，并拟作《木兰歌》一首（《文苑英华》）。至于“朔气”二句这样的对偶诗句，齐、梁诗中已经习见，自是文人加工痕迹。所以现代学者大多认为《木兰诗》产生于北魏，创作于民间。

     　　《木兰诗》记述了木兰女扮男装，代父从军，在战场上建立功勋，回朝后不愿做官，显然也冲击了封建社会重男轻女的偏见。它“事奇诗奇”（沈德潜《古诗源》），富有浪漫色彩，风格也比较刚健古朴，基本上保持了民歌特色。

     　　《木兰诗》的思想内容和艺术技巧，对后世都有深远影响。宋代乐史《太平寰宇记》载，黄州黄冈县（今湖北黄陂）有木兰山、木兰草原、木兰湖，木兰天池等木兰八景，并引杜牧《木兰庙》为证。其后，据地方志所载，在今安徽亳州、河南商丘、河北完县等地，都曾立庙奉祀木兰，反映出《木兰诗》的深刻影响。直到今天，舞台银幕上的木兰形象仍然激励人们的爱国情操。同时，早在韦元甫拟作之前，杜甫《草堂》诗抒写迁居草堂的欢欣情景，已明显汲取了《木兰诗》描述全家欢迎木兰归来的表现手法。
     * translation : 　　叹息声一声接着一声传出，木兰对着房门织布。听不见织布机织布的声音，只听见木兰在叹息。问木兰在想什么？问木兰在惦记什么？（木兰答道）我也没有在想什么，也没有在惦记什么。昨天晚上看见征兵文书，知道君主在大规模征兵，那么多卷征兵文册，每一卷上都有父亲的名字。父亲没有大儿子，木兰（我）没有兄长，木兰愿意为此到集市上去买马鞍和马匹，就开始替代父亲去征战。

     　　在集市各处购买马具。第二天早晨离开父母，晚上宿营在黄河边，听不见父母呼唤女儿的声音，只能听到黄河水流水声。第二天早晨离开黄河上路，晚上到达黑山头，听不见父母呼唤女儿的声音，只能听到燕山胡兵战马的啾啾的鸣叫声。

     　　不远万里奔赴战场，翻越重重山峰就像飞起来那样迅速。北方的寒气中传来打更声，月光映照着战士们的铠甲。将士们身经百战，有的为国捐躯，有的转战多年胜利归来。

     　　胜利归来朝见天子，天子坐在殿堂（论功行赏）。给木兰记很大的功勋，得到的赏赐有千百金还有余。天子问木兰有什么要求，木兰说不愿做尚书郎，希望骑上千里马，回到故乡。

     　　父母听说女儿回来了，互相搀扶着到城外迎接她；姐姐听说妹妹回来了，对着门户梳妆打扮起来；弟弟听说姐姐回来了，忙着霍霍地磨刀杀猪宰羊。每间房都打开了门进去看看，脱去打仗时穿的战袍，穿上以前女孩子的衣裳，当着窗子、对着镜子整理漂亮的头发，对着镜子在面部贴上装饰物。走出去看一起打仗的火伴，火伴们很吃惊，（都说我们）同行数年之久，竟然不知木兰是女孩。

     　　（提着兔子耳朵悬在半空中时）雄兔两只前脚时时动弹、雌兔两只眼睛时常眯着，所以容易分辨。雄雌两兔一起并排跑，怎能分辨哪个是雄兔哪个是雌兔呢？
     * audioUrl : https://guwen-1252396323.cos.ap-chengdu.myqcloud.com/guwen/20180913141944434.mp3
     */

    private IdBean _id;
    private String title;
    private String dynasty;
    private String writer;
    private String content;
    private String remark;
    private String shangxi;
    private String translation;
    private String audioUrl;
    private List<String> type;

    public IdBean get_id() {
        return _id;
    }

    public void set_id(IdBean _id) {
        this._id = _id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDynasty() {
        return dynasty;
    }

    public void setDynasty(String dynasty) {
        this.dynasty = dynasty;
    }

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getShangxi() {
        return shangxi;
    }

    public void setShangxi(String shangxi) {
        this.shangxi = shangxi;
    }

    public String getTranslation() {
        return translation;
    }

    public void setTranslation(String translation) {
        this.translation = translation;
    }

    public String getAudioUrl() {
        return audioUrl;
    }

    public void setAudioUrl(String audioUrl) {
        this.audioUrl = audioUrl;
    }

    public List<String> getType() {
        return type;
    }

    public void setType(List<String> type) {
        this.type = type;
    }

    public static class IdBean {
        /**
         * $oid : 5b9a0136367d5c96f4cd295a
         */

        private String $oid;

        public String get$oid() {
            return $oid;
        }

        public void set$oid(String $oid) {
            this.$oid = $oid;
        }
    }
}
