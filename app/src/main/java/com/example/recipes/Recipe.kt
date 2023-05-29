package com.example.recipes

class Recipe(val name: String, val recipe: String, val imageResourceId: Int) {
    companion object {
        val category1 = arrayOf(
            Recipe(
                "FASZEROWANY KURCZAK BUFFALO",
                "SKŁADNIKI\n" +
                        " 4 PORCJE\n" +
                        "700 g filetu kurczaka\n" +
                        "sól i pieprz\n" +
                        "2 łyżki serka kremowego np. Almette, Twój Smak\n" +
                        "1/2 szklanki startego sera cheddar\n" +
                        "1 łyżka przyprawy meksykańskiej*\n" +
                        "1 łyżka oliwy\n" +
                        "1 łyżka ketchupu\n" +
                        "1 łyżka masła\n" +
                        "1/2 łyżeczki ostrego sosu np. sriracha\n" +
                        "1 łyżka majonezu\n" +
                        "2 łyżki natki pietruszki lub kolendra\n" +
                        "\nPRZYGOTOWANIE\n" +
                        "Piekarnik nagrzać do 190 stopni C.\n" +
                        "Każdy pojedynczy filet przepołowić, następnie każdą część naciąć nożem tworząc kieszonkę na nadzienie.\n" +
                        "Mięso doprawić solą, pieprzem oraz połową przypraw. Do kieszonek włożyć mieszankę serka kremowego, drobno startego sera cheddar oraz reszty przypraw. Złożyć mięso zamykając nadzienie w środku.\n" +
                        "Filety wysmarować oliwą i ułożyć w naczyniu do zapiekania.\n" +
                        "W garnuszku roztopić masło i wymieszać z ketchupem oraz ostrym sosem. Polać po kurczaku.\n" +
                        "Wstawić do nagrzanego piekarnika i piec przez 30 minut.\n" +
                        "Wyjąć z piekarnika, udekorować majonezem i posypać natką pietruszki.",
                R.drawable.faszerowany_kurczak_buffalo,
            ),
            Recipe(
                "MEKSYKAŃSKA SAŁATKA Z NACHOSAMI",
                "SKŁADNIKI\n" +
                        " 2 PORCJE\n" +
                        "MIĘS\u200BO\n" +
                        "100 g mięsa mielonego wołowego\n" +
                        "1 łyżeczka oliwy\n" +
                        "1 ząbek czosnku\n" +
                        "po 1 łyżeczce mielonej papryki i kuminu, po szczypcie cynamonu, ostrej papryki i oregano\n" +
                        "1/2 szklanki bulionu lub wody\n" +
                        "4 łyżki passaty pomidorowej\n" +
                        "GUACAMOLE\n" +
                        "1 awokado\n" +
                        "1/2 ząbka czosnku\n" +
                        "1 łyżeczka soku z limonki\n" +
                        "ORAZ\n" +
                        "200 g chipsów kukurydzianych z tortilli\n" +
                        "60 g sera cheddar\n" +
                        "marynowane jalapeño\n" +
                        "4 łyżki kukurydzy z puszki\n" +
                        "pomidor malinowy lub zwykły\n" +
                        "kawałek czerwonej cebuli\n" +
                        "kolendra lub natka\n" +
                        "\nPRZYGOTOWANIE\n" +
                        "MIĘSO\n" +
                        "Rozgrzać patelnię z oliwą, dodać przeciśnięty przez praskę czosnek i chwilę podsmażyć.\n" +
                        "Dodać mięso i na większym ogniu obsmażyć z każdej strony.\n" +
                        "Doprawić solą, pieprzem oraz przyprawami. Smażyć co chwilę mieszając przez ok. 3 minuty.\n" +
                        "Wlać bulion lub wodę i zagotować. Przykryć i gotować przez ok. 5 - 7 minut.\n" +
                        "Dodać passatę, wymieszać, zagotować, przykryć i gotować pod przykryciem przez ok. 15 minut (do miękkości mięsa). Na koniec odparować pozostały płyn jeśli jest potrzeba.\n" +
                        "GUACAMOLE\n" +
                        "Miąższ awokado rozgnieść lub lekko zmiksować ze startym czosnkiem, limonką i solą.\n" +
                        "ZAPIEKANIE\n" +
                        "Porcję nachosów wyłożyć do naczynia do zapiekania wyłożonego papierem.\n" +
                        "Dodać miejscami trochę mięsa, posypać serem i papryczkami jalapeno. Zapiec aby danie się podgrzało i ser się roztopił (w piekarniku przez ok. 5 min w 200 stopniach, lub przez 1 - 2 minuty w mikrofalówce, moc 600W).\n" +
                        "Pomidora pokroić w kosteczkę. Cebulę drobno posiekać w drobną kosteczkę.\n" +
                        "Wyjąć z piekarnika, posypać kukurydzą, pokrojonym pomidorem i cebulą.\n" +
                        "Na środek wyłożyć guacamole i udekorować całość kolendrą lub posiekaną natką pietruszki.",
                R.drawable.meksykanska_salatka_z_nachosami,
            ),
            Recipe(
                "ZUPA ENCHILADA Z KURCZAKIEM",
                "SKŁADNIKI\n" +
                        " 4 PORCJE\n" +
                        "1 cebula\n" +
                        "2 łyżki oleju\n" +
                        "2 ząbki czosnku\n" +
                        "1 marchewka\n" +
                        "kawałeczek selera\n" +
                        "1 łyżka masła\n" +
                        "200 g filetu kurczaka\n" +
                        "przyprawy: 2 łyżeczki papryki słodkiej, 1/2 ostrej, 1/2 wędzonej, 2 łyżeczki oregano, 2 łyżeczki kuminu mielonego\n" +
                        "1 czerwona papryka\n" +
                        "4 - 5 kawałków suszonych pomidorów\n" +
                        "1 litr gorącego bulionu\n" +
                        "1 puszka obranych pomidorów\n" +
                        "1 puszka kukurydzy\n" +
                        "1 puszka czerwonej fasoli\n" +
                        "2 łyżki koncentratu pomidorowego\n" +
                        "2 łyżki natki pietruszki\n" +
                        "do podania: tarta mozzarella, papryczka jalapeno, chipsy z tortilli, opcjonalnie świeża kolendra, awokado\n" +
                        "\nPRZYGOTOWANIE\n" +
                        "W szerokim garnku na oleju zeszklić pokrojoną w kostkę cebulę.\n" +
                        "Dodać drobno starty czosnek oraz starte na większych oczkach tarki - marchewkę i selera. Smażyć co chwilę mieszając przez około 5 minut.\n" +
                        "Dodać masło oraz pokrojony w niedużą kostkę filet kurczaka. Doprawić go większą szczyptą soli, pieprzem oraz dodać wszystkie przyprawy. Mieszając obsmażać przez około 5 minut.\n" +
                        "Dodać pokrojoną w kosteczkę paprykę i smażyć przez 2 minuty, w razie potrzeby dodać więcej oleju. Dodać posiekane suszone pomidory.\n" +
                        "Wlać gorący bulion i zagotować. Dodać wcześniej zmiksowane pomidory z puszki, wymieszać i gotować przez ok. 10 minut bez przykrycia lub pod uchyloną pokrywą.\n" +
                        "Dodać odcedzone kukurydzę i fasolę z puszki (lekko opłukane na sicie), wymieszać i gotować jak powyżej przez ok. 10 minut, w międzyczasie dodać koncentrat.\n" +
                        "Dodać natkę pietruszki i mieszając gotować przez ok. 1 - 2 minuty.\n" +
                        "Podawać z tartą mozzarellą, papryczkami i chipsami kukurydzianymi z tortilli. Można posypać kolendrą i pokrojonym awokado.",
                R.drawable.zupa_enchilada_z_kurczakiem,
            ),
            Recipe(
                "PIZZADILLA Z SALAMI I PAPRYKĄ",
                "SKŁADNIKI\n" +
                        " 2 PORCJE\n" +
                        "1 łyżeczka oliwy\n" +
                        "1 nieduża papryka (lub po kawałku różnokolorowych)\n" +
                        "180 g tartej mozzarelli (twardszej i żółtej, nie białej z zalewy)\n" +
                        "40 g salami w plasterkach\n" +
                        "4 łyżki SOSU DO PIZZY*\n" +
                        "1/2 łyżeczki suszonego oregano\n" +
                        "świeża bazylia\n" +
                        "2 łyżeczki masła\n" +
                        "2 duże tortille (śr. 25 cm)\n" +
                        "\nPRZYGOTOWANIE\n" +
                        "Paprykę pokroić w drobną kostkę, doprawić solą i podsmażyć chwilę na łyżeczce oliwy, odłożyć na talerz.\n" +
                        "Na dużej patelni rozgrzać i rozprowadzić łyżeczkę masła. Położyć placek tortilli i wyłożyć na niego połowę tartego sera, podsmażoną paprykę i plasterki salami. Skropić równomiernie sosem, posypać suszonym oregano i listkami bazylii. Posypać drugą połową tartego sera.\n" +
                        "Przykryć drugim plackiem tortilli i podsmażać ok. 2 minuty, aż tortilla na spodzie się zrumieni.\n" +
                        "Podgrzaną z jednej strony pizzadillę przełożyć na drugą stronę** i ponownie podsmażyć na maśle do zrumienienia. Przełożyć na deskę, posypać listkami bazylii i kroić na kawałki jak pizzę.\n" +
                        "WSKAZÓWKI\n" +
                        "* Na patelni na oliwie zeszklić starty ząbek czosnku, dodać kilka łyżek krojonych pomidorów (świeżych lub z puszki), doprawić solą, pieprzem i kilkoma listkami bazylii po czym smażyć na większym ogniu aż sos się zredukuje.\n" +
                        "\n" +
                        "** Quesadillę najłatwiej przełożyć na drugą stronę kładąc na wierzchu duży płaski talerz a następnie - dociskając go dłonią - ostrożnie obrócić wszystko o 180 st.",
                R.drawable.pizzadilla,
            ),
            Recipe(
                "FAJITAS Z KURCZAKIEM",
                "SKŁADNIKI\n" +
                        " 4 PORCJE\n" +
                        "KURCZAK FAJITA\n" +
                        "400 g polędwiczek kurczaka (lub całych filetów)\n" +
                        "1 czerwona cebula\n" +
                        "1 czerwona papryka\n" +
                        "1 limonka\n" +
                        "1/2 łyżeczki kuminu (kminu rzymskiego)\n" +
                        "1 łyżeczka wędzonej papryki w proszku\n" +
                        "1 łyżka marynowanej papryczki jalapeño\n" +
                        "2 łyżki oleju roślinnego\n" +
                        "DODATKI\n" +
                        "4 placki TORTILLI\n" +
                        "GUACAMOLE\n" +
                        "1 pomidor\n" +
                        "cebula\n" +
                        "50 g tartego sera cheddar\n" +
                        "SOS RANCZERSKI lub gęsta kwaśna śmietana\n" +
                        "świeża kolendra\n" +
                        "\nPRZYGOTOWANIE\n" +
                        "KURCZAK FAJITA\n" +
                        "Kurczaka pokroić na wąskie paski. Doprawić solą, pieprzem, połową kuminu i wędzonej papryki, polać łyżką oleju roślinnego i łyżeczką soku z limonki, wymieszać, odłożyć na min. pół godziny do zamarynowania.\n" +
                        "Paprykę pokroić na paski, cebulę na szersze półplasterki, dokładnie wymieszać z solą, pieprzem, resztą kuminu, papryki wędzonej, łyżką oleju i soku z limonki.\n" +
                        "Rozgrzać patelnię (np. grillową) położyć fileciki z kurczaka i zgrillować (na większym ogniu po ok. 3 minuty z każdej strony), odłożyć na talerz.\n" +
                        "Na tę samą patelnię włożyć warzywa, zmniejszyć nieco ogień i dokładnie obsmażyć, co chwilę mieszając, w sumie przez ok. 6 - 7 minut. Dodać kurczaka i delikatnie przemieszać składniki. Posypać posiekaną marynowaną papryczką jalapeño.\n" +
                        "PODAWANIE\n" +
                        "Podgrzać TORTILLE i ułożyć je na stole na półmisku. Obok położyć patelnię ze składnikami (kurczak z warzywami).\n" +
                        "W 4 oddzielnych miseczkach podać: (1) GUACAMOLE, (2) pokrojonego w kosteczkę pomidora (bez soku i nasion) wraz z cebulą i kolendrą, (3) tarty ser i (4) SOS RANCZERSKI lub gęstą śmietanę.",
                R.drawable.kurczak_fajita,
            ),
            Recipe(
                "BURRITO",
                        "SKŁADNIKI\n" +
                        " 4 PORCJE\n" +
                        "RYŻ PO MEKSYKAŃSKU\n" +
                        "1/2 cebuli, 1 ząbek czosnku, 1/2 papryczki chili\n" +
                        "1 łyżka oliwy\n" +
                        "220 g (1 szkl.) ryżu długoziarnistego\n" +
                        "450 ml bulionu lub rosołu\n" +
                        "3 łyżki krojonych pomidorów\n" +
                        "CHILI CON CARNE\n" +
                        "1 łyżka oliwy\n" +
                        "1 cebula\n" +
                        "2 ząbki czosnku\n" +
                        "po 1 łyżeczce mielonego chilli, kminu rzymskiego i oregano\n" +
                        "500 g mielonej wołowiny\n" +
                        "100 ml bulionu lub wody\n" +
                        "1 puszka krojonych pomidorów (zostawić 3 łyżki do ryżu)\n" +
                        "1 łyżeczka cukru\n" +
                        "200 g czerwonej fasoli\n" +
                        "opcjonalnie 5 kawałków suszonych pomidorów\n" +
                        "ORAZ\n" +
                        "4 duże placki tortilli\n" +
                        "80 g tartego sera\n" +
                        "opcjonalnie awokado, limonka, kolendra, jalapeno\n" +
                        "kwaśna śmietana\n" +
                        "\nPRZYGOTOWANIE\n" +
                        "Cebulę, czosnek i chili drobno posiekać lub zetrzeć. Włożyć na dużą patelnię i chwilę podsmażyć na łyżce oliwy.\n" +
                        "Dodać surowy ryż i dalej podsmażać aż ryż nieco zbrązowieje (ok. 5 minut).\n" +
                        "Zagotować bulion, dodać pomidory i wymieszać. Wlać na patelnię, zmniejszyć ogień do minimum, przykryć i gotować 25 minut.\n" +
                        "CHILI CON CARNE\n" +
                        "Na dużej patelni na oliwie zeszklić pokrojoną w kosteczkę cebulę, dodać starty czosnek, chilli, kmin rzymski i oregano i mieszając smażyć przez 1 minutę. Dodać zmieloną wołowinę i mieszając zrumienić z każdej strony.\n" +
                        "Dodać bulion oraz pomidory, wymieszać i doprawić cukrem, pieprzem oraz szczyptą soli. Dodać fasolę oraz pokrojone suszone pomidory jeśli ich używamy. Przykryć i dusić ok. 30 min, co jakiś czas zamieszać.\n" +
                        "BURRITO\n" +
                        "Na środek tortilli nałożyć porcję ryżu, chili con carne, tartego sera oraz pokrojonego awokado. Opcjonalnie dodać kawałki jalapeno, skropić limonką i zawinąć (najpierw boki do środka a potem w rulon).\n" +
                        "Zawinięte burrito podgrzać z obydwu stron do zrumienienia tortilli (na patelni lub najlepiej w opiekaczu do kanapek).\n" +
                        "Przekroić na pół, podawać z kwaśną śmietaną i opcjonalnie świeżą kolendrą.\n" +
                        "WSKAZÓWKI\n" +
                        "Przepisy na domowe tortille: PSZENNE / PSZENNE RAZOWE",
                R.drawable.burrito,
            ),
            Recipe(
                "CHURROS",
                "SKŁADNIKI\n" +
                        " OK. 30 SZTUK\n" +
                        "1 szklanka (250 ml) wody\n" +
                        "100 g masła\n" +
                        "1 łyżka cukru wanilinowego\n" +
                        "2 łyżki cukru\n" +
                        "szczypta soli\n" +
                        "1 szklanka mąki pszennej\n" +
                        "3 jajka\n" +
                        "ORAZ\n" +
                        "1 litr oleju roślinnego\n" +
                        "cukier puder z cynamonem\n" +
                        "SOS CZEKOLADOWY\n" +
                        "200 ml śmietanki 30% lub 18%\n" +
                        "100 g czekolady deserowej\n" +
                        "\nPRZYGOTOWANIE\n" +
                        "Wodę zagotować z masłem, cukrem wanilinowym, cukrem i solą.\n" +
                        "Dodać mąkę i mieszać (ucierać) drewnianą łyżką przez ok. 2 minuty, aż powstanie gładka, sprężysta i odchodząca od brzegów garnka masa.\n" +
                        "Odstawić z ognia i postawić garnek na desce. Przestudzić (ok. 30 minut).\n" +
                        "Wbić jedno jajko i mieszać drewnianą łyżką do połączenia się składników w jednolite ciasto. Powtórzyć z dwoma kolejnymi jajkami, za każdym razem mieszając do połączenia składników.\n" +
                        "Przełożyć je do rękawa cukierniczego. Rozgrzać tłuszcz w garnku (180 stopni C). Wyciskać ok. 8 - 10 cm kawałki ciasta bezpośrednio do tłuszczu. Końce odcinać nożyczkami lub nożem.\n" +
                        "Smażyć partiami po parę sztuk, po około 2 minuty z każdej strony na złoty kolor, wyławiać łyżką cedzakową i odkładać na talerz wyłożony ręcznikami papierowymi. Po przestudzeniu posypać cukrem pudrem z cynamonem.\n" +
                        "Sos czekoladowy: śmietankę zagotować, odstawić z ognia, dodać połamaną na kosteczki czekoladę, mieszać do rozpuszczenia i otrzymania gładkiego sosu.",
                R.drawable.churros,
            ),
            Recipe(
                "CHILI CON CARNE Z CHORIZO",
                "SKŁADNIKI\n" +
                        " 4 PORCJE\n" +
                        "150 g kiełbaski chorizo (paprykowej, pikantnej), pokrojonej w kostkę\n" +
                        "1 cebula, pokrojona w kostkę\n" +
                        "500 g mielonej wołowiny (użyłam antrykotu)\n" +
                        "1/2 szklanki gorącej, niezbyt mocnej kawy\n" +
                        "1/2 szklanki gorącego bulionu lub wody\n" +
                        "1 łyżka sosu sojowego\n" +
                        "1 i 1/2 puszki krojonych pomidorów\n" +
                        "200 g (mała puszka) czerwonej fasoli, odsączonej i przepłukanej\n" +
                        "200 g (mała puszka) kukurydzy, odsączonej i przepłukanej\n" +
                        "1 i 1/2 czerwonej papryki, bez gniazd nasiennych, pokrojonej w kostkę\n" +
                        "PRZYPRAWY:\n" +
                        "1/2 łyżeczki mielonej ostrej papryki, 1 łyżeczka kuminu, 1 łyżeczka oregano, 1/2 łyżeczki cynamonu, 1 łyżeczka cukru, szczypta soli i świeżo zmielonego pieprzu\n" +
                        "\nPRZYGOTOWANIE\n" +
                        "W większym garnku podsmażyć chorizo następnie wyjąć je łyżką cedzakową i odłożyć.\n" +
                        "Na wytopionym tłuszczu zeszklić cebulę, dodać wołowinę (oraz łyżkę oliwy jeśli jest taka potrzeba) i krótko obsmażyć mięso.\n" +
                        "Chorizo włożyć z powrotem do garnka, dodać gorącą kawę, bulion oraz sos sojowy i zagotować. Dodać wszystkie przyprawy i wymieszać.\n" +
                        "Dodać pomidory, fasolę i kukurydzę z puszki, wymieszać i zagotować. Dodać paprykę i gotować na małym ogniu z lekko uchyloną pokrywką przez ok. 40 min.\n" +
                        "Podawać z tartym serem, jogurtem naturalnym i świeżą kolendrą, można też skropić limonką. Danie świetnie nadaje się do odgrzewania.\n" +
                        "PROPOZYCJA PODANIA\n" +
                        "tarty ser\n" +
                        "jogurt naturalny\n" +
                        "świeża kolendra\n" +
                        "limonka",
                R.drawable.chili_con_carne_chorizo,
            ),
        )

        val category2 = arrayOf(
            Recipe(
                "RAMEN Z ŁOSOSIEM",
                "SKŁADNIKI\n" +
                        " 4 PORCJE\n" +
                        "ŁOSOŚ\n" +
                        "600 g świeżego łososia\n" +
                        "2 łyżki sosu sojowego\n" +
                        "1 łyżeczka soku z cytryny lub octu ryżowego\n" +
                        "2 łyżeczki oleju sezamowego\n" +
                        "1 łyżka cukru trzcinowego\n" +
                        "2 łyżeczki japońskiej przyprawy shichimi togarashi\n" +
                        "BULION\n" +
                        "1 i 1/2 litra bulionu (może być z eko kostki)\n" +
                        "1 szklanka mleka migdałowego\n" +
                        "1 łyżeczka koreańskiej pasty gochujang lub pasty/oleju chili\n" +
                        "1 łyżka pasty miso\n" +
                        "1 łyżka masła orzechowego lub tahini\n" +
                        "75 g młodego szpinaku\n" +
                        "MAKARON\n" +
                        "400 g świeżego makaronu ramen\n" +
                        "\nPRZYGOTOWANIE\n" +
                        "Odciąć skórkę z łososia, następnie pokroić na mniejsze porcje, włożyć do formy żaroodpornej lub blaszki i skropić sosem sojowym, sokiem z cytryny lub octem ryżowym i olejem sezamowym.\n" +
                        "Łososia posypać cukrem trzcinowym oraz przyprawą shichimi togarashi. Wstawić do piekarnika nagrzanego do 200 stopni C na ok. 15 minut.\n" +
                        "Bulion\n" +
                        "\n" +
                        "Zagotować bulin (lub wodę z kostką) razem z mlekiem migdałowym. Dodać pastę gochujang lub pastę chili, pastę miso oraz masło orzechowe lub tahini. Dokładnie wymieszać cały czas podgrzewając wywar. Na koniec dodać szpinak i poczekać aż zwiędnie.\n" +
                        "Makaron\n" +
                        "\n" +
                        "Makaron wrzucić na wrzątek i gotować ok. 1 minutę, następnie odcedzić.\n" +
                        "PODAWANIE\n" +
                        "Do misek włożyć makaron, dodać łososia, zalać bulionem i skropić dodatkowo sokami z pieczonego łososia. Można posypać shichimi togarashi.",
                R.drawable.ramen_z_lososiem,
            ),
            Recipe(
                "KURCZAK TERIYAKI",
                "SKŁADNIKI\n" +
                        " 3 PORCJE\n" +
                        "KURCZAK TERIYAKI\n" +
                        "ok. 450 g filetów z kurczaka\n" +
                        "1 łyżka oleju roślinnego\n" +
                        "5 łyżek sosu sojowego (jasnego)\n" +
                        "2 łyżki octu ryżowego lub soku z limonki\n" +
                        "2 łyżki syropu klonowego lub miodu lub cukru trzcinowego\n" +
                        "2 ząbki czosnku\n" +
                        "2 łyżeczki startego imbiru\n" +
                        "RYŻ SMAŻONY Z WARZYWAMI\n" +
                        "100 g brązowego ryżu (1 torebka)\n" +
                        "1/2 cebuli\n" +
                        "1 łyżeczka oliwy\n" +
                        "1 ząbek czosnku\n" +
                        "1 łyżeczka startego imbiru\n" +
                        "1/2 czerwonej papryki\n" +
                        "1/2 szklanki zielonego groszku\n" +
                        "2 łyżeczki sosu sojowego\n" +
                        "1 łyżeczka oleju sezamowego\n" +
                        "ORAZ\n" +
                        "2 łyżki uprażonego sezamu\n" +
                        "szczypiorek\n" +
                        "\nPRZYGOTOWANIE\n" +
                        "Filety oczyścić z błonek i kostek. Ugotować brązowy ryż w osolonej wodzie zgodnie z instrukcją na opakowaniu (zwykle ok. 30 - 35 minut, ale warto sprawdzić). Odcedzić.\n" +
                        "Na patelnię wlać składniki sosu teriyaki: olej, sos sojowy, ocet ryżowy lub sok z limonki, syrop klonowy (lub miód lub cukier trzcinowy). Dodać starty czosnek i imbir, zagotować.\n" +
                        "Włożyć filety z kurczaka i przykryć patelnię. Dusić przez ok. 5 minut na umiarkowanym ogniu, przewrócić na drugą stronę i powtórzyć gotowanie pod przykryciem przez 5 minut. Zdjąć pokrywę i gotować przez 5 minut, w międzyczasie 1 - 2 razy przewracając mięso.\n" +
                        "Posypać uprażonym sezamem i szczypiorkiem.\n" +
                        "Ryż smażony z warzywami: na patelnię wlać oliwę, zeszklić pokrojoną w kosteczkę cebulę. Pod koniec dodać starty czosnek i imbir. Dodać groszek i mieszając smażyć przez ok. minutę. Dodać pokrojoną w kosteczkę paprykę i smażyć mieszając przez ok. 1 - 2 minuty. Dodać ryż, sos sojowy i olej sezamowy, mieszając chwilę podsmażać.\n" +
                        "WSKAZÓWKI\n" +
                        "Oryginalny japoński sos teriyaki zawiera w składzie: 60 ml shoyu (japońskiego sosu sojowego), 2 łyżki mirinu, 2 łyżki sake, 1 i 1/2 łyżki drobnego cukru trzcinowego.",
                R.drawable.kurczak_teriyaki,
            ),
            Recipe(
                "MAKARON UDON Z ŁOSOSIEM I SZPARAGAMI",
                "SKŁADNIKI\n" +
                        " 2 PORCJE\n" +
                        "300 g filetu z łososia\n" +
                        "mały pęczek zielonych szparagów\n" +
                        "4 małe dymki\n" +
                        "3 łyżki oliwy\n" +
                        "duża garść małych listków botwinki lub szpinaku\n" +
                        "170 g makaronu Udon*\n" +
                        "MARYNATA I SOS TERYIAKI\n" +
                        "6 łyżek sosu sojowego\n" +
                        "2 łyżki syropu klonowego (lub brązowego cukru)\n" +
                        "1 łyżka soku z limonki\n" +
                        "3 łyżeczki startego imbiru\n" +
                        "1 ząbek czosnku, drobno starty\n" +
                        "DODATKOWO\n" +
                        "2 łyżki sezamu\n" +
                        "2 łyżeczki oleju sezamowego\n" +
                        "\nPRZYGOTOWANIE\n" +
                        "Z łososia odciąć skórę, sprawdzić czy filet nie ma ości. Zamarynować na ok. 1 godzinę w uprzednio wymieszanych składnikach marynaty.\n" +
                        "Odłamać i wyrzucić twarde końce szparagów (same się złamią we właściwym miejscu). Łodygi opłukać i osuszyć. Usunąć zielone części dymki, białe części przekroić wzdłuż na pół. Szparagi i dymkę doprawić solą, pieprzem i wysmarować oliwą.\n" +
                        "Piekarnik nagrzać do 230 stopni C z termoobiegiem lub najlepiej ustawić funkcję grilla na dużą moc. Razem z piekarnikiem nagrzewać blaszkę ustawioną na wyższej półce piekarnika. Na gorącej blaszce położyć łososia (marynatę wcześniej zlać do rondelka), szparagi oraz dymkę i piec przez 8 - 10 minut. Na 3 minuty przed końcem wierzch łososia posypać sezamem.\n" +
                        "Marynatę zagotować w rondelku, następnie zdjąć z ognia i wymieszać z olejem sezamowym. Powstały sos teriyaki trzymać pod ręką.\n" +
                        "Makaron ugotować zgodnie z instrukcją na opakowaniu, odcedzić i włożyć z powrotem do garnka (nie przelewając zimną wodą).\n" +
                        "Do makaronu dodać 1/2 sosu teriyaki, pokrojone na kawałki szparagi, pokrojoną dymkę, kawałki łososia oraz liście botwinki lub szpinaku. Delikatnie wymieszać i wyłożyć na talerze, polać resztą sosu teriyaki.\n" +
                        "WSKAZÓWKI\n" +
                        "* Udon to gruby japoński makaron z mąki pszennej. Zamiast niego w przepisie można też użyć gryczanego makaronu Soba.",
                R.drawable.makaron_udon_z_lososiem_szparagami,
            ),
            Recipe(
                "KOKOSOWY PUDDING Z TAPIOKI Z MUSEM MANGO",
                "SKŁADNIKI\n" +
                        " 4 PORCJE\n" +
                        "500 ml mleka kokosowego\n" +
                        "1/4 szklanki drobnej tapioki (wielkości kaszy)\n" +
                        "3 łyżki ksylitolu lub 2 łyżki cukru\n" +
                        "4 nasiona kardamonu\n" +
                        "1 duże mango\n" +
                        "2 łyżki syropu klonowego\n" +
                        "1/3 łyżeczki imbiru w proszku lub 1/2 łyżeczki świeżego\n" +
                        "owoce jagodowe mrożone (w sezonie świeże) np. czarne porzeczki, jagody, maliny, porzeczki\n" +
                        "listki mięty\n" +
                        "\nPRZYGOTOWANIE\n" +
                        "W garnku zagotować mleko, wsypać tapiokę, następnie dodać ksylitol i cukier. Co chwilę mieszając gotować bez przykrycia przez ok. 20 minut aż tapioka stanie się całkowicie szklista, przezroczysta.\n" +
                        "W międzyczasie dodać kardamon: nasiona rozłupać i wyłuskać ziarenka, rozgnieść je w moździerzu lub zmielić w młynku, dodać do garnka z tapioką. Przelać do małych szklaneczek. Pudding zgęstnieje jeszcze podczas studzenia.\n" +
                        "Mango obrać, obkroić miąższ od pestki. Pokroić w małą kosteczkę i podzielić na pół. Jedną połowę włożyć do rondelka, dodać syrop klonowy i imbir i gotować przez ok. 10 minut aż mango będzie miękkie, wówczas rozdrobnić je blenderem.\n" +
                        "Dodać pozostałe świeże mango i gotować jeszcze 2 minuty, odstawić z ognia. Wyłożyć na deser.\n" +
                        "Dodać owoce jagodowe i udekorować miętą. Można od razu podawać lub odstawić na kilka godzin lub całą noc w chłodne miejsce.",
                R.drawable.kokosowy_pudding_z_tapioki_z_musem_mango,
            ),
            Recipe(
                "KREWETKI W SOSIE MISO",
                "SKŁADNIKI\n" +
                        " 2 PORCJE\n" +
                        "400 g nieobranych, całych krewetek lub 200 g obranych\n" +
                        "1/2 czerwonej papryki\n" +
                        "250 g groszku cukrowego\n" +
                        "100 g (1 woreczek) ryżu\n" +
                        "SOS MISO\n" +
                        "1/4 szklanki wody\n" +
                        "1 łyżka pasty miso\n" +
                        "1/3 puszki mleka kokosowego\n" +
                        "1 łyżeczka masła orzechowego\n" +
                        "ORAZ\n" +
                        "japońska przyprawa shichimi togarashi\n" +
                        "szczypiorek\n" +
                        "papryczka chili\n" +
                        "\nPRZYGOTOWANIE\n" +
                        "Mrożone krewetki rozmrozić, osuszyć. Świeże całe krewetki oczyścić - oderwać głowy, zdjąć pancerze, następnie nacinając grzbiet po wypukłej i wklęsłej stronie krewetki wyjąć czarne jelita. Ogonki można pozostawić.\n" +
                        "Ugotować ryż w lekko osolonej wodzie. Na 1 - 2 minuty przed końcem dodać do ryżu groszek cukrowy.\n" +
                        "Na patelnię wlać wodę, włożyć pastę miso, dodać mleko kokosowe i masło orzechowe. Zagotować mieszając aż powstanie jednolity sos (ok. 2 minuty).\n" +
                        "Dodać paprykę pokrojoną w kosteczkę i gotować 1 - 2 minuty.\n" +
                        "Dodać krewetki i gotować na umiarkowanym ogniu przez ok. 1 minutę (świeże większe krewetki) lub ok. 15 sekund (krewetki gotowane).\n" +
                        "Przewrócić na drugą stronę i powtórzyć gotowanie zachowując takie same czasy jak poprzednio. Doprawić przyprawą shichimi togarashi.\n" +
                        "Posypać pokrojoną papryczką chili i szczypiorkiem, udekorować kilkoma strączkami groszku. Podawać z ryżem oraz resztą groszku.",
                R.drawable.krewetki_w_sosie_miso,
            ),
            Recipe(
                "YAKI SOBA Z MIELONYM MIĘSEM DROBIOWYM",
                        "SKŁADNIKI\n" +
                                " 2 PORCJE\n" +
                                "150 - 200 g mielonego mięsa drobiowego (indyk, kurczak)\n" +
                                "sól, pieprz\n" +
                                "3 cm kawałek imbiru\n" +
                                "2 łyżki sosu sojowego\n" +
                                "125 g suchego makaronu jajecznego \"noodles\" np. chow mein\n" +
                                "1/2 podłużnej papryki\n" +
                                "1 mała cebula np. cukrowa\n" +
                                "1/2 szklanki kiełków fasoli mung\n" +
                                "2 łyżki oleju kokosowego\n" +
                                "1 jajko\n" +
                                "4 łyżki szczypiorku\n" +
                                "2 łyżki uprażonego sezamu\n" +
                                "marynowany imbir (np. młody, różowy)\n" +
                                "\nPRZYGOTOWANIE\n" +
                                "Mięso włożyć do miski, dodać obrany i drobno starty imbir, doprawić solą, pieprzem i polać sosem sojowym, wymieszać.\n" +
                        "Makaron ugotować w lekko osolonej wodzie zgodnie z instrukcją na opakowaniu, odcedzić.\n" +
                        "Paprykę pokroić na kawałeczki, cebulę na półplasterki. Kiełki odcedzić.\n" +
                        "Rozgrzać wok z olejem kokosowym. Dodać przygotowane warzywa (paprykę, cebulę i kiełki) i smażyć co chwilę mieszając łopatką przez ok. 1 minutę.\n" +
                        "Przesunąć warzywa na brzeg woka, w wolne miejsce doprawione mięso. Obsmażyć na większym ogniu przez ok. 3 minuty, pod koniec mieszając mięso z warzywami.\n" +
                        "Zrobić miejsce w woku i wbić w nie jajko, usmażyć jak omlet, następnie wymieszać ze składnikami w woku.\n" +
                        "Dodać makaron i mieszając co chwilę łopatką smażyć całość przez ok. 2 minuty, w międzyczasie dodać posiekany szczypiorek i skropić danie dodatkowym sosem sojowym.\n" +
                        "Posypać sezamem i podawać z marynowanym, różowym imbirem.",
                R.drawable.yakisoba_z_mielonym_miesem_drobiowym,
            ),
            Recipe(
                "TATAR Z ŁOSOSIA",
                "SKŁADNIKI\n" +
                        " 2 PORCJE\n" +
                        "200 g łososia UGOTOWANEGO METODĄ SOUS-VIDE\n" +
                        "1 łyżka sosu sojowego\n" +
                        "1/3 łyżeczki startego imbiru\n" +
                        "1/2 łyżeczki wasabi\n" +
                        "DO PODANIA (OPCJONALNIE):\n" +
                        "cząstki limonki\n" +
                        "żółtko przepiórcze lub kurze (jeśli używamy też skorupki jaja, należy ją sparzyć wrzątkiem)\n" +
                        "DO DEKORACJI (OPCJONALNIE):\n" +
                        "kiełki, czarny sezam lub czarnuszka, szczypiorek\n" +
                        "\nPRZYGOTOWANIE\n" +
                        "Łososia posiekać na desce, dodać sos sojowy, starty imbir i wasabi, znów posiekać.\n" +
                        "Włożyć do 2 miseczek wysmarowanych olejem roślinnym a następnie wyłożyć na 2 talerze. Pośrodku zrobić dołek i umieścić w nim żółtko.\n" +
                        "Udekorować szczypiorkiem, kiełkami lub sezamem i podawać z limonką.",
                R.drawable.tatar_z_lososia,
            ),
            Recipe(
                "JAPOŃSKA ZUPA MISOSHIRU",
                "SKŁADNIKI\n" +
                        " 4 PORCJE\n" +
                        "10 cm kawałek konbu\n" +
                        "10 g suszonych płatków tuńczyka bonito (katsuobushi), około 4 szklanek\n" +
                        "5 szklanek chłodnej wody\n" +
                        "5 g suszonych glonów wakame, około 3/4 szklanki\n" +
                        "2 łyżki pasty miso\n" +
                        "100 ml sake\n" +
                        "100 g tofu\n" +
                        "OPCJONALNIE:\n" +
                        "grzyby shiitake (8 sztuk) z puszki (czytaj wskazówki)\n" +
                        "sezam uprażony na suchej patelni\n" +
                        "szczypiorek\n" +
                        "\nPRZYGOTOWANIE\n" +
                        "Najpierw przygotować bulion dashi - z glonów konbu i płatków tuńczyka. Glony konbu włożyć do garnka, zalać 4 szklankami chłodnej wody i odstawić na 25 minut do namoczenia. Wywar przecedzić do drugiego garnka, glony odłożyć, nie będą już potrzebne do zupy. Wywar doprowadzić prawie do zagotowania na małym ogniu, następnie dodać 1 szklankę wody.\n" +
                        "Dodać płatki bonito i doprowadzić do zagotowania na większym ogniu. Zdjąć z ognia, zszumować, odczekać kilka - kilkanaście minut aż płatki opadną na dno. Wywar przecedzić przez sitko, płatki nie będą wykorzystane.\n" +
                        "Glony wakame należy moczyć w zimnej wodzie przez około 10 - 15 minut, po tym czasie znacznie zwiększą swoją objętość.\n" +
                        "Do zagotowanego klarownego bulionu dashi dodać pastę miso (uprzednio rozprowadzoną w kilku łyżkach gorącego bulionu), sake i od razu odstawić z ognia.\n" +
                        "Do miseczek nałożyć porcję odcedzonych glonów wakame, tofu pokrojone w kostkę oraz odcedzone grzyby shiitake jeśli ich używamy. Zalać bulionem i opcjonalnie posypać prażonym sezamem.\n" +
                        "WSKAZÓWKI\n" +
                        "Bulion dashi można też zrobić z gotowej pasty dashi.\n" +
                        "Jeśli mamy suszone grzyby shiitake, należy je wcześniej namoczyć w ciepłej wodzie i ugotować. Można je ugotować w wywarze z glonów i płatków bonito (przed dodaniem pasty miso).",
                R.drawable.misoshiru,
            ),
        )
    }
}