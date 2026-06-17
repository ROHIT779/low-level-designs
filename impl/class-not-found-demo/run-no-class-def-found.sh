javac -d target ./src/*
cd target
java NoClassDefFoundErrorDemo
mv Item.class NewItem.class
java NoClassDefFoundErrorDemo