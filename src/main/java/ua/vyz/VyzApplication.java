package ua.vyz;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import ua.vyz.model.Facultet;
import ua.vyz.model.Vyz;
import ua.vyz.repository.FacultetRepository;
import ua.vyz.repository.VyzRepository;

import java.util.*;

@SpringBootApplication
public class VyzApplication {

    public static void main(String[] args) {
        SpringApplication.run(VyzApplication.class, args);
    }

    @Bean
    public CommandLineRunner init(final VyzRepository vyzRepository, final FacultetRepository facultetRepository) {
        return strings -> {
            List<Facultet> kpiFacultets = Arrays.asList(
                    new Facultet(1, " Комп'ютерні науки"),
                    new Facultet(2, "Системний аналіз"),
                    new Facultet(3, "Телекомунікації та радіотехніка"),
                    new Facultet(4, "Прикладна механіка"),
                    new Facultet(5, "Галузеве машинобудування"),
                    new Facultet(6, "Прикладна фізика та наноматеріали"),
                    new Facultet(7, "Прикладна математика"),
                    new Facultet(8, "Кібербезпека"),
                    new Facultet(9, "Журналістика"),
                    new Facultet(10, " Менеджмент"),
                    new Facultet(11, "Інженерія програмного забезпечення"),
                    new Facultet(12, "Комп'ютерні науки"),
                    new Facultet(13, "Атомна енергетика"),
                    new Facultet(14, "Прикладна математика"),
                    new Facultet(15, "Фізика та астрономія"),
                    new Facultet(16, "Електроніка"),
                    new Facultet(17, "Маркетинг")
                    );
            kpiFacultets.forEach(facultetRepository::save);

            List<Facultet> dutFacultets = Arrays.asList(
                    new Facultet(1, "Програмна інженерія"),
                    new Facultet(2, "Комп’ютерні науки"),
                    new Facultet(3, "Системний аналіз"),
                    new Facultet(4, "Безпека інформаційних і комунікаційних систем"),
                    new Facultet(5, "Управління інформаційною безпекою"),
                    new Facultet(6, "Менеджмент"),
                    new Facultet(7, "Маркетинг"),
                    new Facultet(8, "Економіка підприємств ІТ-бізнесу"),
                    new Facultet(9, "Телекомунікаційні системи та мережі"),
                    new Facultet(10, "Супутникові телекомунікації та навігаційні системи"),
                    new Facultet(11, "Волоконно-оптичні системи передачі"),
                    new Facultet(12, "Системи технічного захисту інформації"),
                    new Facultet(13, "Комп’ютерна інженерія")
                    );
            dutFacultets.forEach(facultetRepository::save);

            List<Facultet> kneuFacultets = Arrays.asList(
                    new Facultet(1, "Менеджмент"),
                    new Facultet(2, "Право"),
                    new Facultet(3, " Підприємництво"),
                    new Facultet(4, "Економічна кібернетика"),
                    new Facultet(5, "Комп’ютерні науки"),
                    new Facultet(6, "Економіка"),
                    new Facultet(7, "Фінанси, банківська справа та страхування"),
                    new Facultet(8, "Облік і оподаткування"),
                    new Facultet(9, "Кібербезпека"),
                    new Facultet(10, "Кібербезпека"),
                    new Facultet(11, "Міжнародні економічні відносини"),
                    new Facultet(12, "Психологія"),
                    new Facultet(13, "Соціологія"),
                    new Facultet(14, "Туризм"),
                    new Facultet(15, "Підприємництво, торгівля та біржова діяльність")
                    );
            kneuFacultets.forEach(facultetRepository::save);

            List<Facultet> nubipFacultets = Arrays.asList(
                    new Facultet(1, "Економіка"),
                    new Facultet(2, "Психологія"),
                    new Facultet(3, "Журналістика"),
                    new Facultet(4, "Менеджмент"),
                    new Facultet(5, "Маркетинг"),
                    new Facultet(6, "Комп’ютерні науки"),
                    new Facultet(7, "Кібербезпека"),
                    new Facultet(8, "Галузеве машинобудування"),
                    new Facultet(9, "Право"),
                    new Facultet(10, "Біотехнології та біоінженерія"),
                    new Facultet(11, "Комп’ютерна інженерія"),
                    new Facultet(12, "Фінанси, банківська справа та страхування"),
                    new Facultet(13, "Агрономія"),
                    new Facultet(14, "Будівництво та цивільна інженерія"),
                    new Facultet(15, "Психологія")
                    );
            nubipFacultets.forEach(facultetRepository::save);

            List<Facultet> kntuFacultets = Arrays.asList(
                    new Facultet(1, "Право"),
                    new Facultet(2, "Економіка"),
                    new Facultet(3, "Менеджмент"),
                    new Facultet(4, "Міжнародні економічні відносини"),
                    new Facultet(5, "Психологія"),
                    new Facultet(6, "Філологія"),
                    new Facultet(7, "Журналістика"),
                    new Facultet(8, "Маркетинг"),
                    new Facultet(9, "Системний аналіз"),
                    new Facultet(10, "Кібербезпека"),
                    new Facultet(11, "Харчові технології"),
                    new Facultet(12, "Інженерія програмного забезпечення"),
                    new Facultet(13, "Туризм"),
                    new Facultet(14, "Готельно-ресторанна справа"),
                    new Facultet(15, "Харчові технології")
                    );
            kntuFacultets.forEach(facultetRepository::save);

            List<Facultet> lpiFacultets= Arrays.asList(
                    new Facultet(1, "Цивільна безпека"),
                    new Facultet(2, "Економіка"),
                    new Facultet(3, "Менеджмент"),
                    new Facultet(4, "Маркетинг"),
                    new Facultet(5, "Туризм"),
                    new Facultet(6, "Соціологія"),
                    new Facultet(7, "Міжнародні економічні відносини"),
                    new Facultet(8, "Атомна енергетика"),
                    new Facultet(9, "Прикладна механіка"),
                    new Facultet(10, "Матеріалознавство"),
                    new Facultet(11, "Філологія"),
                    new Facultet(12, "Інженерія програмного забезпечення"),
                    new Facultet(13, "Комп’ютерні науки"),
                    new Facultet(14, "Системний аналіз"),
                    new Facultet(15, "Кібербезпека"),
                    new Facultet(16, "Право"),
                    new Facultet(17, "Психологія")
                    );
            lpiFacultets.forEach(facultetRepository::save);

            List<Facultet> kpnuFacultets = Arrays.asList(
                    new Facultet(1, "Комп’ютерні науки"),
                    new Facultet(2, "Історія та археологія"),
                    new Facultet(3, "Філологія"),
                    new Facultet(4, "Журналістика"),
                    new Facultet(5, "Фізична терапія, ерготерапія"),
                    new Facultet(6, "Підприємництво, торгівля та біржова діяльність"),
                    new Facultet(7, "Фізична культура і спорт"),
                    new Facultet(8, "Дошкільна освіта"),
                    new Facultet(9, "Початкова освіта"),
                    new Facultet(10, "Туризм"),
                    new Facultet(11, "Спеціальна освіта"),
                    new Facultet(12, "Екологія"),
                    new Facultet(13, "Соціальна робота"),
                    new Facultet(14, "Економіка"),
                    new Facultet(15, "Психологія"),
                    new Facultet(16, "Політологія"),
                    new Facultet(17, "Біологія")
                    );
            List<Facultet> hpiFacultets = Arrays.asList(
                    new Facultet(1, "Екологія"),
                    new Facultet(2, "Прикладна механіка"),
                    new Facultet(3, "Матеріалознавство"),
                    new Facultet(4, "Галузеве машинобудування"),
                    new Facultet(5, "Гідроенергетика"),
                    new Facultet(6, "Цивільна безпека"),
                    new Facultet(7, "Електроніка"),
                    new Facultet(7, "Прикладна фізика та наноматеріали"),
                    new Facultet(8, "Прикладна математика"),
                    new Facultet(9, "Комп’ютерні науки"),
                    new Facultet(10, "Мікро- та наносистемна техніка"),
                    new Facultet(11, "Економіка"),
                    new Facultet(12, "Журналістика"),
                    new Facultet(13, "Маркетинг"),
                    new Facultet(14, "Комп’ютерні науки"),
                    new Facultet(15, "Кібербезпека"),
                    new Facultet(16, "Психологія"),
                    new Facultet(18, "Соціологія")
                    );
            hpiFacultets.forEach(facultetRepository::save);

            List<Facultet> lnuFacultets = Arrays.asList(
                    new Facultet(1, "Інженерія програмного забезпечення"),
                    new Facultet(2, "Комп’ютерні науки"),
                    new Facultet(3, "нформаційні системи та технології"),
                    new Facultet(4, "Мікро- та наносистемна техніка"),
                    new Facultet(5, "Економіка"),
                    new Facultet(6, "Облік і оподаткування"),
                    new Facultet(7, "Фінанси, банківська справа і страхування"),
                    new Facultet(8, "Менеджмент"),
                    new Facultet(9, "Маркетинг"),
                    new Facultet(10, "Підприємництво, торгівля та біржова діяльність"),
                    new Facultet(11, "Економіка"),
                    new Facultet(12, "Облік і оподаткування"),
                    new Facultet(13, "Фінанси, банківська справа і страхування"),
                    new Facultet(14, "Менеджмент"),
                    new Facultet(15, "Маркетинг"),
                    new Facultet(16, "Підприємництво, торгівля та біржова діяльність"),
                    new Facultet(17, "Комп’ютерні науки"),
                    new Facultet(18, "Соціологія")

                    );
            lnuFacultets.forEach(facultetRepository::save);

            kpnuFacultets.forEach(facultetRepository::save);

            List<Facultet> facultets = new ArrayList<>();
//            facultets.add(botanu);

            Facultet pacuku = new Facultet(2, "Пацани");
            List<Facultet> facultetPacuku = new ArrayList<>();
            facultetPacuku.add(pacuku);

//            facultetRepository.save(botanu);
            facultetRepository.save(pacuku);
            List<Vyz> vyzs = Arrays.asList(
                    new Vyz(1, "КПІ", "Київ", 120, kpiFacultets),
                    new Vyz(2, "ДУТ", "Київ", 130, facultets),
                    new Vyz(3, "КНЕУ", "Київ", 130, facultets),
                    new Vyz(4, "НУБІП", "Київ", 140, facultets),
                    new Vyz(5, "КНТЕУ", "Київ", 150, facultets),
                    new Vyz(6, "ЛПІ", "KЛьвів", 180, facultets),
                    new Vyz(7, "ХНУ", "Хмельницький", 180, facultets),
                    new Vyz(8, "КПНУ", "Камянець-Подільський", 180, facultets),
                    new Vyz(9, "ХПІ", "Харків", 180, facultets),
                    new Vyz(10, "ЛНУ", "Львів", 180, facultets));

            vyzs.forEach(vyzRepository::save);
            };
        }
    }