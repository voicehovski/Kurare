: -d - помещать классы в указанный каталог. При необходимости каталог будет создан автоматически, как и иерархия каталогов в соответствии с пакетами
: <src> - имя нужно указывать с учетом иерархии каталогов пакета. Котируются как прямые, так и обратные слеши. Можно компилировать через link. Можно указывать сразу несколько файлов
: 

: --source-path <path>	Путь где исходные файлы (дерево пакетов)
: --release [6..11]	Каким компилятором	?
: -target <release>	Для какой виртуальной машины	?
: -verbose	Показывать что делает компилятор

javac -d classes dev/mtd/sty/kurare/Kurare.java