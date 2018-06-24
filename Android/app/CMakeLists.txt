# For more information about using CMake with Android Studio, read the
# documentation: https://d.android.com/studio/projects/add-native-code.html

# Sets the minimum version of CMake required to build the native library.
cmake_minimum_required(VERSION 3.4.1)

option(GENERATE_DOCS "" OFF)
option(GENERATE_TESTS "" OFF)
option(GENERATE_DEMOS "" OFF)
add_subdirectory(./../../External/Pineapple {CMAKE_LIBRARY_OUTPUT_DIRECTORY})
add_pineapple_app(PineappleDemo ./../../Source/Main.cpp)