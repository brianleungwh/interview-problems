# longest_run("abbbcc") (1, 3)
# longest_run("aabbc") (0, 1)
# longest_run("abcd") (0, 0)
# longest_run("aabbbccccc") (5, 9)
def longest_run(string):
    toReturn = [0, 0]
    if len(string) <= 1:
        return toReturn
    moving_start_index = 0
    streaking_letter = string[0]
    current_streak_count = 1
    for i in range(1, len(string)):
        current_letter = string[i]
        if current_letter == streaking_letter:
            current_streak_count += 1
            max_streak_count = toReturn[1] - toReturn[0] + 1
            if current_streak_count > max_streak_count:
                toReturn[0] = moving_start_index
                toReturn[1] = i
        else:
            streaking_letter = string[i]
            moving_start_index = i
            current_streak_count = 1
    return toReturn

# "aabbccc"   {a:2, b:2, c:3}
# "abcd"      {a:1, b:1, c:1, d:1}
# "abcdcccbb" {a:1, b:2, c:3, d:1}
def longest_run_dict(string):
    toReturn = {}
    last_letter = string[0]
    count = 1
    toReturn[last_letter] = count
    for i in range(1, len(string)):
        current_letter = string[i]
        if last_letter == current_letter:
            count += 1
            if count > toReturn[current_letter]:
                toReturn[current_letter] = count
        else:
            count = 1
            last_letter = current_letter
            if current_letter not in toReturn:
                toReturn[current_letter] = count
    return toReturn
