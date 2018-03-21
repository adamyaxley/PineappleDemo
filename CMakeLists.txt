cmake_minimum_required(VERSION 3.1)
project(PineappleDemo)

execute_process(COMMAND git submodule update --init -- External/Pineapple
                WORKING_DIRECTORY ${CMAKE_CURRENT_SOURCE_DIR})

option(GENERATE_DOCS "" OFF)
option(GENERATE_TESTS "" OFF)
option(GENERATE_DEMOS "" OFF)
add_subdirectory(External/Pineapple)

add_pineapple_app(PineappleDemo Source/Main.cpp)