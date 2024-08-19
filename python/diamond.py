class Diamond:

    def __init__(self, middle_letter):
        self.middle_letter = middle_letter

    def print_diamond(self):
        return "A\n"


def main(middle_letter):
    return Diamond(middle_letter).print_diamond()


if __name__ == "__main__":
    import sys

    if len(sys.argv) > 1:
        print(main(sys.argv[1][0]))
    else:
        print("please supply one argument: the char of the diamond middle")
