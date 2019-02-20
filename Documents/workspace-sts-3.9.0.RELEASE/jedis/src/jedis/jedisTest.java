package jedis;

import org.junit.Test;

import redis.clients.jedis.Jedis;

public class jedisTest {
	@Test
	public void test() {
		Jedis jedis = new Jedis("192.168.195.128", 6379);
		Long setnx = jedis.setnx("13", "20");
	}
}
