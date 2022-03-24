package com.github.ponser2000.kladr.model.gnivc;


import java.util.Comparator;

public record KladrGnivc (
        String name,
        String socr,
        String code,
        String index,
        String gninmb,
        String uno,
        String ocatd,
        String status

    // Наименование
    // Сокращенное наименование типа объекта
    // Код
    // Почтовый индекс
    // Код ИФНС
    // Код территориального участка ИФНС
    // Код ОКАТО
    // Статус объекта
)
{

    public static final Comparator<KladrGnivc> COMPARE_BY_CODE = new Comparator<KladrGnivc>() {
        @Override
        public int compare(KladrGnivc lhs, KladrGnivc rhs) {
            return lhs.code().compareTo(rhs.code());
        }
    };

    public String getCodeRegion(){
        return code().substring(0,2);
    }

    public String getCodeAreas(){
        return code().substring(2,5);
    }

    public String getCodeTown(){
        return code().substring(5,8);
    }

    public String getCodePopulate(){
        return code().substring(8,11);
    }

    public String getCodeActual(){
        return code().substring(11,13);
    }

}
